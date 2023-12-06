/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.juego;

import java.util.Scanner;

/**
 *
 * @author felip
 */
public class Juego {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Jugadores g1 = new Jugadores("guerrero", 15, 150);
        Jugadores m1 = new Jugadores("mago", 5, 150);
        Jugadores h1 = new Jugadores("hibrido", 10, 150);
        System.out.println("eliga un personaje");
        System.out.println("1. guerrero");
        System.out.println("2. mago");
        System.out.println("3. hibrido");
        int op = sc.nextInt();
        int op2 = (int) (Math.random() * (3 - 1 + 1)) + 1;
        Jugadores p1 = p1(op, g1, m1, h1);
        Jugadores p2 = p2(op2, g1, m1, h1);
        System.out.println(" ");
        int atk = 0;
        int atk2 = 0;
        boolean band1 = true;
        boolean band2 = true;
        while (p1.getHp() > 0 && p2.getHp() > 0) {
            int d1 = (int) (Math.random() * (2 - 1 + 1)) + 1;
            if (d1 == 1) {
                System.out.println("es tu turno de atacar");
                if (op == 1) {

                    //guerrero
                    System.out.println("elige tu ataque");
                    System.out.println("1. ataque");
                    System.out.println("2. doble ataque");
                    atk = sc.nextInt();

                    if (atk == 1 ) {
                        p1.atacar(p2);
                        System.out.println("la vida de tu rival es " + p2.getHp());
                    }
                    if (atk == 2 ) {
                        p1.dobleAtaque(p2);
                        System.out.println("la vida de tu rival es " + p2.getHp());
                    }

                    if (p1.getHp() < 30 && band1 == true) {
                        p1.frenesis(p2);
                        System.out.println("la vida de tu rival es " + p2.getHp());
                        band1 = false;
                    }
                }
            
            if (op == 2) {
                //magooo
                System.out.println("elige tu ataque");
                System.out.print("1.bola de fuego ");
                System.out.println("2. flecha de fuego");
                System.out.println("3. robo de vida");
                atk = sc.nextInt();

                if (atk == 1) {
                    p1.atkfuego(p2);
                    System.out.println("la vida de tu rival es " + p2.getHp());
                }
                if (atk == 2 ) {
                    p1.atkflecha(p2);
                    System.out.println("la vida de tu rival es " + p2.getHp());
                }

                if (atk == 3 && band1 == true) {
                    System.out.println("actvivaste robo de vida");
                    p1.roboVida(p2);
                    band1 = false;
                }
                if (p1.getHp() < 15 && band1 == true) {
                    p1.exploFuego(p2);
                    System.out.println("la vida de tu rival es " + p2.getHp());
                    band1 = false;
                }

            }

            if (op == 3) {
                System.out.println("elige tu ataque");
                System.out.print("1.ataque fuego ");
                System.out.println("2. flecha de fuego");
                System.out.println("3. ataque");
                System.out.println("4. doble ataque");
                if (atk == 1) {
                    p1.atkfuego(p2);
                }
                if (atk == 2) {
                    p1.atkflecha(p2);
                }
                if (atk == 3) {
                    p1.atacar(p2);
                }
                if (atk == 4) {
                    p1.dobleAtaque(p2);
                }
            }
            }
            System.out.println(" ");

            if (d1 == 2) {
                System.out.println("el rival ataca.........");
                if (op2 == 1) {

                    System.out.println("guerreroo");
                    atk2 = (int) (Math.random() * (2 - 1 + 1)) + 1;
                    

                    if (atk2 == 1) {
                        p2.atacar(p1);
                        System.out.println("tu vida es " + p1.getHp());
                    }
                    if (atk2 == 2) {
                        p2.dobleAtaque(p1);
                        System.out.println("tu vida es " + p1.getHp());
                    }
                    if (p2.getHp() < 30) {
                        System.out.println("rival ataque especial");
                        p2.frenesis(p2);
                        System.out.println("tu vida es " + p1.getHp());
                    }
                    System.out.println(" ");
                }

                if (op2 == 2) {

                    System.out.println("magooo");
                    //magooo
                    atk2 = (int) (Math.random() * (3 - 1 + 1)) + 1;
                
                if (atk2 == 1) {
                    p2.atkfuego(p1);
                    System.out.println("tu vida es " + p1.getHp());
                }
                if (atk2 == 2) {
                    p2.atkflecha(p1);
                    System.out.println("tu vida es " + p1.getHp());

                }
                if (atk2 == 3 && band2 == true) {
                    System.out.println("te robaron vida");
                    p2.roboVida(p1);
                    band2 = false;
                }
                if (p2.getHp() < 15 &&band2 ==true) {
                    p2.exploFuego(p1);
                    System.out.println("tu vida es " + p1.getHp());
                    band2=false;
                }
                    System.out.println(" ");
                }
            if (op2 == 3) {
                System.out.println("hibridoo");
                atk2 = (int) (Math.random() * (4 - 1 + 1)) + 1;
                if (atk2 == 1) {
                    p2.atkfuego(p1);
                    System.out.println("tu vida es " + p1.getHp());
                }
                if (atk2 == 2) {
                    p2.atkflecha(p1);
                    System.out.println("tu vida es " + p1.getHp());
                }
                if (atk2 == 3) {
                    p2.atacar(p1);
                    System.out.println("tu vida es " + p1.getHp());
                }
                if (atk2 == 4) {
                    p2.dobleAtaque(g1);
                    System.out.println("tu vida es " + p1.getHp());
                }
            }
                System.out.println(" ");
            }
        }
        System.out.println(" ");
        System.out.println("................................................");
        System.out.println(" ");
    }

    private static Jugadores p1(int per, Jugadores g1, Jugadores m1, Jugadores h1) {
        switch (per) {
            case 1:
                g1.mostar();
                return g1;
            case 2:
                m1.mostar();
                return m1;
            case 3:
                h1.mostar();
                return h1;
            default:
                System.out.println("error");

        }
        return null;
    }

    private static Jugadores p2(int per2, Jugadores g1, Jugadores m1, Jugadores h1) {

        switch (per2) {
            case 1:
                g1.mostar();
                return g1;
            case 2:
                m1.mostar();
                return m1;
            case 3:
                h1.mostar();
                return h1;
            default:

        }
        return null;
    }
}
