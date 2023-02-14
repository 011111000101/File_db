package service;

public class Crypton implements Crypto{
    @Override
    public int cryptChar(char c) {
        int result = Integer.parseInt(Integer.toBinaryString((int) c));
        return result;
    }

    @Override
    public char deCryptInt(int number) {
        return 0;
    }
}
