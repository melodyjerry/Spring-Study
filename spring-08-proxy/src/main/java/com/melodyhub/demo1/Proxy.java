package com.melodyhub.demo1;

public class Proxy implements Rent{

    private Landlord landlord;

    public Proxy() {
    }

    public Proxy(Landlord landlord) {
        this.landlord = landlord;
    }


    @Override
    public void rent() {
        landlord.rent();
        System.out.println("中介帮忙出租！");
        seeHouse();
        fare();
        contract();
    }

    //看房
    public void seeHouse(){
        System.out.println("中介带你去看房！");
    }

    //收中介费
    public void fare(){
        System.out.println("中介收取中介费！");
    }

    //签合同
    public void contract(){
        System.out.println("中介和你签合同！");
    }
}
