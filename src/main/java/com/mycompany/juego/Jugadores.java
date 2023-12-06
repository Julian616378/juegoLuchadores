/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.juego;

/**
 *
 * @author felip
 */
public class Jugadores {
    private String nombre;
    private int ataque;
    private int hp;
   

    public Jugadores(String nombre, int ataque, int hp) {
        this.nombre = nombre;
        this.ataque = ataque;
        this.hp = hp;
        
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAtaque() {
        return ataque;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    
    public void mostar (){
        System.out.println(this.nombre);
        System.out.println("estadisticas : ");
        System.out.println("su vida es:"+hp);
        System.out.println("su ataque es: "+ataque);
    }
    //ataques basicos
     public void atacar(Jugadores Jugadores) {
        
        System.out.println("El guerrero ataca");
        Jugadores.hp = Jugadores.hp-ataque;
           }
     public void dobleAtaque(Jugadores Jugadores) {
         System.out.println("ataque doble");
        Jugadores.hp=Jugadores.hp-(ataque*2);
    }
     public void atkfuego(Jugadores Jugadores){
         System.out.println("bola de fuego");
         Jugadores.hp=Jugadores.hp-(ataque+15);
          
     }
     public void atkflecha(Jugadores Jugadores){
         System.out.println("flecha de fuego");
         Jugadores.hp=Jugadores.hp-(ataque+7);
          
     }
     //ataques especiales, solo se puden usar una vez por juego
     public void frenesis(Jugadores Jugadores){
         System.out.println("habilidad especial frenesis");
         int d1 =(int) (Math.random() * (5 - 3+1)) + 3;
         for (int i = 0; i < d1; i++) {
             Jugadores.hp = Jugadores.hp-ataque;
         }
         
     }
     
     public void exploFuego(Jugadores Jugadores){
         System.out.println("ataque es epecial.........");
         int d1 =(int) (Math.random() * (30 - 15+1)) + 15;
         Jugadores.hp=Jugadores.hp-(ataque+d1);
     }
     public void roboVida(Jugadores Jugadores){
         int d1 =(int) (Math.random() * (30 - 15+1)) + 15;
         Jugadores.hp=Jugadores.hp-d1;
         this.hp=this.hp+d1;
         System.out.println("robo de "+d1);}

        
}
