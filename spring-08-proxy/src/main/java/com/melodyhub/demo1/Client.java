package com.melodyhub.demo1;

public class Client {
    public static void main(String[] args) {
        //房东出租房子
        Landlord landlord = new Landlord();

        //找中介前
        //landlord.rent();

        //代理，中介帮房东出租房子，但是中介会带有一些其他操作
        Proxy proxy = new Proxy(landlord);
        //你不用直接面对房东，直接找中介租房子即可！
        proxy.rent();
    }
}
