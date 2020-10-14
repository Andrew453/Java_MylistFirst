package com.company;

public class List {
    class Item {
        private int value;
        private Item next;


        public Item(int value) {
            this.value = value;
            this.next = null;
        }


        public boolean hasNext() {
            if (this.next != null) {
                return true;
            } else {
                return false;
            }
        }

        public int getValue() {
            return value;
        }

        public void setValue(int value) {
            this.value = value;
        }

        public Item getNext() {
            return next;
        }

        public void setNext(Item next) {
            this.next = next;
        }

        public String toString() {
            return Long.toString(this.value);
        }
    }

    private Item begin;
    private long counter;

    public List() {
        this.begin = null;
        this.counter = 0;
    }

    public long getCounter() {
        return counter;
    }

    public void add(int value) {
        Item item = new Item(value);
        if (this.begin == null)
            this.begin = item;
        else {
            end().setNext(item);
        }
        this.counter++;
    }

    public Item end() {
        if (this.begin == null)
            return null;
        Item iter = this.begin;
        while (iter.hasNext()) {
            iter = iter.getNext();
        }
        return iter;
    }

    public String toString() {
        String result = "[";
        if (this.begin == null)
            return null;
        else {
            Item iter = this.begin;
            while (iter.hasNext()) {
                result += iter.toString() + ", ";
                iter = iter.getNext();
            }
            result += iter.toString();
        }
        result += " ]";
        return result;
    }



}

/*
int min = 2147483647;
        int minPos = 0;
        Item iter;
        for (int i = 0; i < this.counter; ++i) {
            iter = indexAt(i);
            for (int j = i; j < this.counter; ++j) {
                if(iter != null ) {
                    int get = iter.getValue();
                    if (get <= min) {
                        minPos = j;
                        min = get;
                    }
                    iter = iter.getNext();

                }
            }
            swap(i, minPos);
            min = 2147483647;

        }





 */
/*
if(firstPos!=secondPos) {
            if ((firstPos >= 0) && (firstPos <= this.counter-1) && (secondPos >= 0) && (secondPos <= this.counter-1) && (firstPos != 0) && (secondPos != 0) && (Math.abs(firstPos - secondPos) > 1)) {
                beforeFirst = indexAt(firstPos - 1);
                beforeSecond = indexAt(secondPos - 1);
                if (firstPos == this.counter-1)
                    afterFirst = null;
                else
                    afterFirst = indexAt(firstPos + 1);
                if (secondPos == this.counter-1)
                    afterSecond = null;
                else
                    afterSecond = indexAt(secondPos + 1);
                beforeFirst.setNext(second);
                beforeSecond.setNext(first);
                first.setNext(afterSecond);
                second.setNext(afterFirst);
            }
            if ((firstPos >= 0) && (firstPos <= this.counter-1) && (secondPos >= 0) && (secondPos <= this.counter-1) && (firstPos == 0)) {

                if (secondPos == this.counter-1)
                    afterSecond = null;
                else
                    afterSecond = indexAt(secondPos + 1);
                beforeSecond = indexAt(secondPos - 1);
                Item afterBegin = indexAt(firstPos + 1);
                beforeSecond.setNext(this.begin);
                this.begin.setNext(afterSecond);
                this.begin = second;
                this.begin.setNext(afterBegin);
            }
            if ((firstPos >= 0) && (firstPos <= this.counter-1) && (secondPos >= 0) && (secondPos <= this.counter-1) && (secondPos == 0)) {
                if (firstPos == this.counter-1)
                    afterFirst = null;
                else
                    afterFirst = indexAt(firstPos + 1);
                beforeFirst = indexAt(firstPos - 1);
                Item afterBegin = indexAt(secondPos + 1);
                beforeFirst.setNext(this.begin);
                this.begin.setNext(afterFirst);
                this.begin = first;
                this.begin.setNext(afterBegin);
            }
            if ((firstPos >= 0) && (firstPos <= this.counter-1) && (secondPos >= 0) && (secondPos <= this.counter-1) && (firstPos != 0) && (secondPos != 0) && (secondPos - firstPos == 1)) {
                beforeFirst = indexAt(firstPos - 1);
                if (secondPos == this.counter-1)
                    afterSecond = null;
                else
                    afterSecond = indexAt(secondPos + 1);
                beforeFirst.setNext(second);
                second.setNext(first);
                first.setNext(afterSecond);

            }
            if ((firstPos >= 0) && (firstPos <= this.counter-1) && (secondPos >= 0) && (secondPos <= this.counter-1) && (firstPos != 0) && (secondPos != 0) && (firstPos - secondPos == 1)) {
                beforeSecond = indexAt(secondPos - 1);
                if (firstPos == this.counter-1)
                    afterFirst = null;
                else
                    afterFirst = indexAt(firstPos + 1);
                beforeSecond.setNext(first);
                first.setNext(second);
                second.setNext(afterFirst);

            }
        }
 */