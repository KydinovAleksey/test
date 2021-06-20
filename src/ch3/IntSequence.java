package ch3;

public interface IntSequence {
    boolean hasNext();
    int next();

    static IntSequence of(int n) {
        return new IntSequence() {
            private int number;

            public boolean hasNext() {
                return number != 0;
            }

            public int next() {
                int result = number % 10;
                number /= 10;
                return result;
            }
        };
    }

    static IntSequence constant(int constant) {
        return new IntSequence() {
            final int CONSTANT = constant;

            @Override
            public boolean hasNext() {
                return true;
            }

            @Override
            public int next() {
                return CONSTANT;
            }
        };
    }
}