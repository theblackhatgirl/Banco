package com.ana;

public class Conta {

    private int num;
    private String titular;
    private double saldo;

    public Conta(int num, String titular){
        this.num = num;
        this.titular = titular;
    }
    public Conta(int num, String titular, double saldo){
        this.num = num;
        this.titular = titular;
        this.saldo = saldo;
    }

    public int getNum(){
        return num;
    }
    public String getTitular(){
        return titular;
    }
    public void setTitular(String titular){
        this.titular = titular;
    }
    public double getSaldo(){
        return saldo;
    }

    public void deposito(double valor){
        saldo += valor;
    }
    public void saque(double valor){
        saldo -= valor + 5;
    }
    public String toString(){
        return "Número da conta: "+num+" Nome do titular: "+titular+" Saldo: "+saldo;
    }
}
