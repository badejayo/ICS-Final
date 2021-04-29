/**
 * PETER KOO & AYO BADEJOH
 * 06/14/2019
 * ICS3U2 ISU
 * Hardware information application
 */

import java.util.Scanner;
import java.text.NumberFormat;

public class Main {

    public static void main(String[] args) {

        int mainChoice=0, subChoice, subSubChoice, subSubSubChoice, quizAnswer, questionRight=0, counterQ1=0, counterQ2=0, counterQ3=0, counterQ4=0, counterQ5=0, counterQ6=0, bonusRound, totalQuestion=0, bonusCounter=0;
        double grade, userMoney=0;
        final String USER_NAME;
        Scanner input = new Scanner(System.in);
        NumberFormat percent = NumberFormat.getPercentInstance();
        NumberFormat money = NumberFormat.getCurrencyInstance();

        System.out.print("User Name: ");
        USER_NAME = input.nextLine();
        System.out.println("                                                                                                                                      \n" +
                " :;;;;;;;;;;;;; ;;;;;;;;;;;;;`                                                                                                        \n" +
                " :;;;;;;;;;;;;; ;;;;;;;;;;;;;`                                                                                                        \n" +
                " :;;;;;;;;;;;;; ;;;;;;;;;;;;;`                                                                                                        \n" +
                " :;;;;;;;;;;;;; ;;;;;;;;;;;;;`                                                                                                        \n" +
                " :;;;;;;;;;;;;; ;;;;;;;;;;;;;`                                                                                            :;;;        \n" +
                " :;;;;;;;;;;;;; ;;;;;;;;;;;;;`        ;;;;          ;;;;   ;;.                                                           ;;;;;        \n" +
                " :;;;;;;;;;;;;; ;;;;;;;;;;;;;`        ;;;;.        .;;;;  ,;;;                                                          ;;;;.:   `    \n" +
                " :;;;;;;;;;;;;; ;;;;;;;;;;;;;`        ;;;;;        ;;;;;   ;;:                                                          ;;;    ;;;    \n" +
                " :;;;;;;;;;;;;; ;;;;;;;;;;;;;`        ;;;;;        ;;;;;                                                                ;;;    ;;;    \n" +
                " :;;;;;;;;;;;;; ;;;;;;;;;;;;;`        ;;,;;:      ;;;;;;                                                                ;;;    ;;;    \n" +
                " :;;;;;;;;;;;;; ;;;;;;;;;;;;;`        ;;,;;;      ;;,;;;   ;;,    `;;;;;;  ;;; ;;;   :;;;;;;     `;;;;;     :;;;;;:   ;;;;;;;;;;;;;;; \n" +
                " :;;;;;;;;;;;;; ;;;;;;;;;;;;;`        ;;,.;;.    ,;; ;;;   ;;:   :;;;;;;;  ;;;;;;;  ;;;;;;;;;   `;;;;;;    ;;;;;;;;;  ;;;;;;;;;;;;;;; \n" +
                " :;;;;;;;;;;;;; ;;;;;;;;;;;;;`        ;;, ;;;    ;;; ;;;   ;;:  .;;;.  `;  ;;;;:.: ;;;;   ;;;;  ;;;   .   ;;;;   ;;;; ``;;;````;;;``` \n" +
                "                                      ;;, :;;    ;;  ;;;   ;;:  ;;;        ;;;,    ;;;     ;;;  ;;;       ;;;     ;;;   ;;;    ;;;    \n" +
                " ,,,,,,,,,,,,,, ,,,,,,,,,,,,,`        ;;,  ;;:  ;;;  ;;;   ;;:  ;;;        ;;;    :;;`     .;;, ;;;:     :;;`     ,;;.  ;;;    ;;;    \n" +
                " :::::::::::::: :::::::::::::`        ;;,  ;;;  ;;,  ;;;   ;;: .;;,        ;;;    ;;;       ;;: .;;;;;   ;;;      `;;:  ;;;    ;;;    \n" +
                " :::::::::::::: :::::::::::::`        ;;,  `;;`,;;   ;;;   ;;: .;;.        ;;;    ;;;       ;;:  `;;;;;  ;;;       ;;:  ;;;    ;;;    \n" +
                " :::::::::::::: :::::::::::::`        ;;,   ;;;;;;   ;;;   ;;: `;;:        ;;;    ;;;      `;;,    `;;;; ;;;      .;;.  ;;;    ;;;    \n" +
                " :::::::::::::: :::::::::::::`        ;;,   :;;;;    ;;;   ;;:  ;;;        ;;;    `;;;     ;;;       ;;; .;;;     ;;;   ;;;    ;;;    \n" +
                " :::::::::::::: :::::::::::::`        ;;,    ;;;;    ;;;   ;;:  ;;;;    ;  ;;;     ;;;,   ,;;;  ;    ;;;  ;;;,   :;;;   ;;;    ;;;    \n" +
                " :::::::::::::: :::::::::::::`        ;;,    ;;;,    ;;;   ;;,   ;;;;;;;;  ;;;      ;;;;;;;;;   ;;;;;;;.  `;;;;;;;;;    ;;;    ;;;;;; \n" +
                " :::::::::::::: :::::::::::::`        ;;,    `;;     ;;;   ;;,    ;;;;;;;  ;;;       ;;;;;;;    ;;;;;;,     ;;;;;;;     ;;;     ;;;;; \n" +
                " :::::::::::::: :::::::::::::`                                       `                 ``         ``          ``                  `   \n" +
                " :::::::::::::: :::::::::::::`                                                                                                        \n" +
                " :::::::::::::: :::::::::::::`                                                                                                        \n" +
                " :::::::::::::: :::::::::::::`                                                                                                        \n" +
                " :::::::::::::: :::::::::::::`                                                                                                        \n" +
                " :::::::::::::: :::::::::::::`                                                                                                        \n" +
                "                                       \n" +
                "\n");
        System.out.println("Welcome " + USER_NAME + "!\n");
        do
        {
            if (mainChoice==0)
            {
                System.out.println("Main Menu\n1. Start Game\n2. Instruction\n3. About Program\n4. Exit");
                System.out.println("---------------");
                System.out.print("What would you like to do? ");
                mainChoice = input.nextInt();
                System.out.println("---------------");
                do
                {
                    if (mainChoice == 1)
                    {
                        System.out.println("Start Game");
                        System.out.println("\t1. Learn\n\t2. Back to Main menu\n\t3. Exit");
                        System.out.println("---------------");
                        System.out.print("What would you like to do? ");
                        subChoice = input.nextInt();
                        System.out.println("---------------");

                        do
                        {
                            if (subChoice == 1)
                            {
                                System.out.println("Learn About");
                                System.out.println("\t1. Computer Memory\n\t2. Hard Disk/Floppy Disk\n\t3. CDs\n\t4. BIOS\n\t5. CD-Burner\n\t6. Tech-related bonus\n\t7. Back to Start Game menu\n\t8. Back to Main menu\n\t9. Exit");
                                System.out.println("---------------");
                                System.out.print("What would you like to do? ");
                                subSubChoice = input.nextInt();
                                System.out.println("---------------");
                                if (subSubChoice == 1)
                                {
                                    System.out.println("Computer Memory");
                                    System.out.println("\nMemory is defined as any form of electric storage. RAM, the most popular type of memory is short for random access memory, it is called this because it can access any \n" +
                                            "memory cell directly if the computer knows the row and column that intersects that cell. ROM a.k.a read only memory/ firmware is a circuit that is preprogrammed with \n" +
                                            "data when it is manufactured. Next is the cache, the cache is a temporary storage area reserved for data that is used often. When you turn your computer on it loads its \n" +
                                            "data from the ROM which did a test to make sure all parts and memory were working, then it loaded whatever your computer’s OS is onto your computer's RAM so that your CPU \n" +
                                            "has complete control over its data. Then you opened our game on IntelliJ which was loaded onto RAM and are able to play our game, if you play our game a lot \n" +
                                            "(which we’re sure you will) it will eventually be stored in cache memory which allows your computer to run faster. In fact, the reason there are so many forms of memory \n" +
                                            "is because of speed. In order to keep up with your CPU (and prevent freezing) your computer would require a lot of expensive memory so to give you the best bang for your \n" +
                                            "buck your computer tiers memory (uses small amounts of expensive memory and then backs it up with large amounts of cheap memory).");
                                    System.out.println("---------------");
                                    System.out.println("1. Back to Learn About Menu\n2. Quiz Yourself\n3. Back to Start Game Menu\n4. Back to Main Menu\n5. Exit");
                                    System.out.println("---------------");
                                    System.out.print("What would you like to do? ");
                                    subSubSubChoice = input.nextInt();
                                    System.out.println("---------------");

                                    if (counterQ1==0)
                                    {
                                        if (subSubSubChoice == 2)
                                        {
                                            counterQ1++;
                                            System.out.println("Question 1: When you turn your computer on, what form of memory gives it its initial data and runs diagnostic checks?");
                                            System.out.println("\t1. Hard Drive\n\t2. ROM\n\t3. RAM\n\t4. All of the above");
                                            System.out.println("---------------");
                                            System.out.print("What is your answer? ");
                                            quizAnswer = input.nextInt();
                                            System.out.println("---------------");
                                            if (quizAnswer==2)
                                            {
                                                questionRight++;
                                                userMoney += 10000;
                                                System.out.println("Correct");
                                            }
                                            else
                                            {
                                                System.out.println("Incorrect");
                                            }
                                            System.out.println("Your estimated salary: " + money.format(userMoney));
                                            System.out.println("---------------");
                                            totalQuestion++;
                                            System.out.println("Question 2: I play Fortnite a lot, initially Fortnite will run off of ____ until it gets stored in ______.");
                                            System.out.println("\t1. RAM, cache\n\t2. Hard Drive, RAM\n\t3. ROM, CPU\n\t4. None of the above");
                                            System.out.println("---------------");
                                            System.out.print("What is your answer? ");
                                            quizAnswer = input.nextInt();
                                            System.out.println("---------------");
                                            if (quizAnswer==1)
                                            {
                                                questionRight++;
                                                userMoney += 10000;
                                                System.out.println("Correct");
                                            }
                                            else
                                            {
                                                System.out.println("Incorrect");
                                            }
                                            System.out.println("Your estimated salary: " + money.format(userMoney));
                                            System.out.println("---------------");
                                            totalQuestion++;
                                            System.out.println("Question 3: Different types of memory are used because of?");
                                            System.out.println("\t1. Cost\n\t2. Speed\n\t3. Tiering\n\t4. All of the above");
                                            System.out.println("---------------");
                                            System.out.print("What is your answer? ");
                                            quizAnswer = input.nextInt();
                                            System.out.println("---------------");
                                            if (quizAnswer==4)
                                            {
                                                questionRight++;
                                                System.out.println("Correct");
                                                userMoney += 10000;
                                            }
                                            else
                                            {
                                                System.out.println("Incorrect");
                                            }
                                            System.out.println("Your estimated salary: " + money.format(userMoney));
                                            System.out.println("---------------");
                                            totalQuestion++;
                                        }
                                        else if (subSubSubChoice == 3)
                                        {
                                            //back to start game menu
                                            subChoice = 0;
                                            mainChoice = 1;
                                        }
                                        else if (subSubSubChoice == 4)
                                        {
                                            //back to main menu
                                            subChoice = 0;
                                            mainChoice = 0;
                                        }
                                        else if (subSubSubChoice == 5)
                                        {
                                            //exit
                                            subChoice = 0;
                                            mainChoice = 4;
                                        }
                                    }
                                    else
                                    {
                                        System.out.println("You already have taken this quiz.");
                                    }
                                }
                                else if (subSubChoice == 2)
                                {
                                    System.out.println("Hard Disk/Floppy Disk");
                                    System.out.println("\nThe best way to understand the workings of a hard drive is to imagine inside is a mini-record player. If we imagine it as a record player, the platter is a record that \n" +
                                            "happens to be magnetic and spins really fast, data is stored between the ridges of the record and there is an arm but on hard drives, it holds a read / write head that can \n" +
                                            "move incredibly fast. Floppy disk drives have a lot of the same biology, they have an arm with a read/ write head, motors to spin it, and a disk for the read/write head to \n" +
                                            "act on. In fact, the only main differences are floppy disk drives spin slower, have less capacity, and slower access times. To input data there is a message from the \n" +
                                            "computer to commence spinning, a motor to move the head to the right track, then the floppy disk erases the space it wants to write on, a bit wider than needed to be safe, \n" +
                                            "attracts magnetic materials on the surface in a pattern where there north and south can be used to read data, then the disk stops spinning and waits for a new command.");
                                    System.out.println("---------------");
                                    System.out.println("1. Back to Learn About Menu\n2. Quiz Yourself\n3. Back to Start Game Menu\n4. Back to Main Menu\n5. Exit");
                                    System.out.println("---------------");
                                    System.out.print("What would you like to do? ");
                                    subSubSubChoice = input.nextInt();
                                    System.out.println("---------------");

                                    if (counterQ2==0)
                                    {
                                        if (subSubSubChoice == 2)
                                        {
                                            counterQ2++;
                                            System.out.println("Question 1: Hard drives have an inner structure similar to?");
                                            System.out.println("\t1. Computers\n\t2. USBs\n\t3. Record Players\n\t4. Cars");
                                            System.out.println("---------------");
                                            System.out.print("What is your answer? ");
                                            quizAnswer = input.nextInt();
                                            System.out.println("---------------");
                                            if (quizAnswer==3)
                                            {
                                                questionRight++;
                                                userMoney += 10000;
                                                System.out.println("Correct");
                                            }
                                            else
                                            {
                                                System.out.println("Incorrect");
                                            }
                                            System.out.println("Your estimated salary: " + money.format(userMoney));
                                            System.out.println("---------------");
                                            totalQuestion++;
                                            System.out.println("Question 2: Floppy disk drives and Hard drives differ how?");
                                            System.out.println("\t1. Floppy disk drives don’t have arms.\n\t2. Floppy disk drives spin faster.\n\t3. Floppy disk drives aren’t magnetic.\n\t4. Floppy disk drives have less capacity.");
                                            System.out.println("---------------");
                                            System.out.print("What is your answer? ");
                                            quizAnswer = input.nextInt();
                                            System.out.println("---------------");
                                            if (quizAnswer==4)
                                            {
                                                questionRight++;
                                                userMoney += 10000;
                                                System.out.println("Correct");
                                            }
                                            else
                                            {
                                                System.out.println("Incorrect");
                                            }
                                            System.out.println("Your estimated salary: " + money.format(userMoney));
                                            System.out.println("---------------");
                                            totalQuestion++;
                                            System.out.println("Question 3: What is the correct process for writing data on a floppy disk?");
                                            System.out.println("\t1. Commence spinning, move the head to the right spot, erase space, magnetize materials, stop spinning.\n" +
                                                    "\t2. Commence spinning, move the head to the right spot, erase space, etch binary into disk, stop spinning.\n" +
                                                    "\t3. Commence spinning, erase space, move the head to the right spot, scan data onto disk, stop spinning.\n" +
                                                    "\t4. Commence spinning, move the head to the right spot, read data, stop spinning.");
                                            System.out.println("---------------");
                                            System.out.print("What is your answer? ");
                                            quizAnswer = input.nextInt();
                                            System.out.println("---------------");
                                            if (quizAnswer==1)
                                            {
                                                questionRight++;
                                                userMoney += 10000;
                                                System.out.println("Correct");
                                            }
                                            else
                                            {
                                                System.out.println("Incorrect");
                                            }
                                            System.out.println("Your estimated salary: " + money.format(userMoney));
                                            System.out.println("---------------");
                                            totalQuestion++;
                                        }
                                        else if (subSubSubChoice == 3)
                                        {
                                            //back to start game menu
                                            subChoice = 0;
                                            mainChoice = 1;
                                        }
                                        else if (subSubSubChoice == 4)
                                        {
                                            //back to main menu
                                            subChoice = 0;
                                            mainChoice = 0;
                                        }
                                        else if (subSubSubChoice == 5)
                                        {
                                            //exit
                                            subChoice = 0;
                                            mainChoice = 4;
                                        }
                                    }
                                    else
                                    {
                                        System.out.println("You already have taken this quiz.");
                                    }
                                }
                                else if (subSubChoice == 3)
                                {
                                    System.out.println("CDs");
                                    System.out.println("\nA CD is a simple piece of polycarbonate plastic, about 1.2mm thick. The plastic has microscopic bumps imprinted as a long, singular spiral track of data starting at the \n" +
                                            "center when it is being manufactured. Then a reflective aluminum layer is put to cover the bumps as well as an acrylic layer for protection. The bumps are so small that if \n" +
                                            "you stretch out the spiral it would be 5 km long! How these bumps are read will be discussed in CD Burners.");
                                    System.out.println("---------------");
                                    System.out.println("1. Back to Learn About Menu\n2. Quiz Yourself\n3. Back to Start Game Menu\n4. Back to Main Menu\n5. Exit");
                                    System.out.println("---------------");
                                    System.out.print("What would you like to do? ");
                                    subSubSubChoice = input.nextInt();
                                    System.out.println("---------------");

                                    if (counterQ3==0)
                                    {
                                        if (subSubSubChoice == 2)
                                        {
                                            counterQ3++;
                                            System.out.println("Question 1: How many spiral tracks does a CD have?");
                                            System.out.println("\t1. None\n" +
                                                    "\t2. One\n" +
                                                    "\t3. Two\n" +
                                                    "\t4. Too many to count");
                                            System.out.println("---------------");
                                            System.out.print("What is your answer? ");
                                            quizAnswer = input.nextInt();
                                            System.out.println("---------------");
                                            if (quizAnswer==2)
                                            {
                                                questionRight++;
                                                userMoney += 10000;
                                                System.out.println("Correct");
                                            }
                                            else
                                            {
                                                System.out.println("Incorrect");
                                            }
                                            System.out.println("Your estimated salary: " + money.format(userMoney));
                                            System.out.println("---------------");
                                            totalQuestion++;
                                            System.out.println("Question 2: How thick is a CD?");
                                            System.out.println("\t1. 1.2 micrometers\n" +
                                                    "\t2. 1.2 nanometers\n" +
                                                    "\t3. 1.2 millimeters\n" +
                                                    "\t4. 1.2 centimeters");
                                            System.out.println("---------------");
                                            System.out.print("What is your answer? ");
                                            quizAnswer = input.nextInt();
                                            System.out.println("---------------");
                                            if (quizAnswer==3)
                                            {
                                                questionRight++;
                                                userMoney += 10000;
                                                System.out.println("Correct");
                                            }
                                            else
                                            {
                                                System.out.println("Incorrect");
                                            }
                                            System.out.println("Your estimated salary: " + money.format(userMoney));
                                            System.out.println("---------------");
                                            totalQuestion++;
                                            System.out.println("Question 3: What are the layers of a CD?");
                                            System.out.println("\t1. Polycarbonate, aluminum, music\n" +
                                                    "\t2. Polycarbonate and aluminum\n" +
                                                    "\t3. Polycarbonate, aluminum, acrylic\n" +
                                                    "\t4. Polycarbonate, aluminum, acrylic, paper");
                                            System.out.println("---------------");
                                            System.out.print("What is your answer? ");
                                            quizAnswer = input.nextInt();
                                            System.out.println("---------------");
                                            if (quizAnswer==3)
                                            {
                                                questionRight++;
                                                userMoney += 10000;
                                                System.out.println("Correct");
                                            }
                                            else
                                            {
                                                System.out.println("Incorrect");
                                            }
                                            System.out.println("Your estimated salary: " + money.format(userMoney));
                                            System.out.println("---------------");
                                            totalQuestion++;
                                        }
                                        else if (subSubSubChoice == 3)
                                        {
                                            //back to start game menu
                                            subChoice = 0;
                                            mainChoice = 1;
                                        }
                                        else if (subSubSubChoice == 4)
                                        {
                                            //back to main menu
                                            subChoice = 0;
                                            mainChoice = 0;
                                        }
                                        else if (subSubSubChoice == 5)
                                        {
                                            //exit
                                            subChoice = 0;
                                            mainChoice = 4;
                                        }
                                    }
                                    else
                                    {
                                        System.out.println("You already have taken this quiz.");
                                    }
                                }
                                else if (subSubChoice == 4)
                                {
                                    System.out.println("BIOS");
                                    System.out.println("\nThe BIOS is usually the first thing you see when you boot up your computer. BIOS stands for basic input/output system and is a program with many functions. It checks \n" +
                                            "if all other chips, hard drives, ports, and CPU are in sync through the Power On Self Test. It manages settings for the hard drive and clock which are crucial in the \n" +
                                            "function of computers. Another one of its important roles is loading the operating system.");
                                    System.out.println("---------------");
                                    System.out.println("1. Back to Learn About menu\n2. Quiz Yourself\n3. Back to Start Game Menu\n4. Back to Main Menu\n5. Exit");
                                    System.out.println("---------------");
                                    System.out.print("What would you like to do? ");
                                    subSubSubChoice = input.nextInt();
                                    System.out.println("---------------");

                                    if (counterQ4==0)
                                    {
                                        if (subSubSubChoice == 2)
                                        {
                                            counterQ4++;
                                            System.out.println("Question 1: BIOS stands for  ____.");
                                            System.out.println("\t1. Biography\n" +
                                                    "\t2. Basic input/output schedule\n" +
                                                    "\t3. Bitcoin is on sale\n" +
                                                    "\t4. Basic input/output system");
                                            System.out.println("---------------");
                                            System.out.print("What is your answer? ");
                                            quizAnswer = input.nextInt();
                                            System.out.println("---------------");
                                            if (quizAnswer==4)
                                            {
                                                questionRight++;
                                                userMoney += 10000;
                                                System.out.println("Correct");
                                            }
                                            else
                                            {
                                                System.out.println("Incorrect");
                                            }
                                            System.out.println("Your estimated salary: " + money.format(userMoney));
                                            System.out.println("---------------");
                                            totalQuestion++;
                                            System.out.println("Question 2: Which task does the BIOS perform?");
                                            System.out.println("\t1. Power-on self-test (POST)\n" +
                                                    "\t2. Performs circuit analysis on if-else statements\n" +
                                                    "\t3. Checks for syntax errors  \n" +
                                                    "\t4. Downloads a handful of viruses");
                                            System.out.println("---------------");
                                            System.out.print("What is your answer? ");
                                            quizAnswer = input.nextInt();
                                            System.out.println("---------------");
                                            if (quizAnswer==1)
                                            {
                                                questionRight++;
                                                userMoney += 10000;
                                                System.out.println("Correct");
                                            }
                                            else
                                            {
                                                System.out.println("Incorrect");
                                            }
                                            System.out.println("Your estimated salary: " + money.format(userMoney));
                                            System.out.println("---------------");
                                            totalQuestion++;
                                            System.out.println("Question 3: True or False, computers without a BIOS would only be a bit slower when booting up.");
                                            System.out.println("\t1. True\n" +
                                                    "\t2. False");
                                            System.out.println("---------------");
                                            System.out.print("What is your answer? ");
                                            quizAnswer = input.nextInt();
                                            System.out.println("---------------");
                                            if (quizAnswer==2)
                                            {
                                                questionRight++;
                                                userMoney += 10000;
                                                System.out.println("Correct");
                                            }
                                            else
                                            {
                                                System.out.println("Incorrect");
                                            }
                                            System.out.println("Your estimated salary: " + money.format(userMoney));
                                            System.out.println("---------------");
                                            totalQuestion++;
                                        }
                                        else if (subSubSubChoice == 3)
                                        {
                                            //back to start game menu
                                            subChoice = 0;
                                            mainChoice = 1;
                                        }
                                        else if (subSubSubChoice == 4)
                                        {
                                            //back to main menu
                                            subChoice = 0;
                                            mainChoice = 0;
                                        }
                                        else if (subSubSubChoice == 5)
                                        {
                                            //exit
                                            subChoice = 0;
                                            mainChoice = 4;
                                        }
                                    }
                                    else
                                    {
                                        System.out.println("You already have taken this quiz.");
                                    }
                                }
                                else if (subSubChoice == 5)
                                {
                                    System.out.println("CD-Burner");
                                    System.out.println("\nData on the disc is represented by a series of 1s and 0s. In CDs when the laser passes over a flat area in the track, the beam is reflected directly to an optical sensor \n" +
                                            "which the CD player interprets it as 1. When the beam passes over a bump, the light is bounced away from the optical sensor which the CD player interprets it as 0. With \n" +
                                            "CD-Rs instead of bumps a transparent/opaque outer layer is used. When a light goes through, it registers as a 1 and when it’s too dark to go through it registers as a 0. \n" +
                                            "This is made through the use of a laser but results in non-reusable disks. CD-RW discs attempt to solve the problem by manipulating a compound’s state through temperature \n" +
                                            "in certain areas to mimic a typical CD.");
                                    System.out.println("---------------");
                                    System.out.println("1. Back to Learn About menu\n2. Quiz Yourself\n3. Back to Start Game Menu\n4. Back to Main Menu\n5. Exit");
                                    System.out.println("---------------");
                                    System.out.print("What would you like to do? ");
                                    subSubSubChoice = input.nextInt();
                                    System.out.println("---------------");

                                    if (counterQ5==0)
                                    {
                                        if (subSubSubChoice == 2)
                                        {
                                            counterQ5++;
                                            System.out.println("Question 1: Where does the laser beam need to be reflected to get 1s in CD players?");
                                            System.out.println("\t1. Disc\n" +
                                                    "\t2. Nowhere\n" +
                                                    "\t3. Optical drive\n" +
                                                    "\t4. Optical sensor");
                                            System.out.println("---------------");
                                            System.out.print("What is your answer? ");
                                            quizAnswer = input.nextInt();
                                            System.out.println("---------------");
                                            if (quizAnswer==4)
                                            {
                                                questionRight++;
                                                userMoney += 10000;
                                                System.out.println("Correct");
                                            }
                                            else
                                            {
                                                System.out.println("Incorrect");
                                            }
                                            System.out.println("Your estimated salary: " + money.format(userMoney));
                                            System.out.println("---------------");
                                            totalQuestion++;
                                            System.out.println("Question 2: What is data read as on CDs?");
                                            System.out.println("\t1. 0s and 1s\n" +
                                                    "\t2. 0s and 2s\n" +
                                                    "\t3. 1s and 2s\n" +
                                                    "\t4. Music");
                                            System.out.println("---------------");
                                            System.out.print("What is your answer? ");
                                            quizAnswer = input.nextInt();
                                            System.out.println("---------------");
                                            if (quizAnswer==1)
                                            {
                                                questionRight++;
                                                userMoney += 10000;
                                                System.out.println("Correct");
                                            }
                                            else
                                            {
                                                System.out.println("Incorrect");
                                            }
                                            System.out.println("Your estimated salary: " + money.format(userMoney));
                                            System.out.println("---------------");
                                            totalQuestion++;
                                            System.out.println("Question 3: Which type of disk uses knowledge of melting points to write its data?");
                                            System.out.println("\t1. CD\n" +
                                                    "\t2. CD-R\n" +
                                                    "\t3. CD-RW\n" +
                                                    "\t4. All of the above");
                                            System.out.println("---------------");
                                            System.out.print("What is your answer? ");
                                            quizAnswer = input.nextInt();
                                            System.out.println("---------------");
                                            if (quizAnswer==3)
                                            {
                                                questionRight++;
                                                userMoney += 10000;
                                                System.out.println("Correct");
                                            }
                                            else
                                            {
                                                System.out.println("Incorrect");
                                            }
                                            System.out.println("Your estimated salary: " + money.format(userMoney));
                                            System.out.println("---------------");
                                            totalQuestion++;
                                        }
                                        else if (subSubSubChoice == 3)
                                        {
                                            //back to start game menu
                                            subChoice = 0;
                                            mainChoice = 1;
                                        }
                                        else if (subSubSubChoice == 4)
                                        {
                                            //back to main menu
                                            subChoice = 0;
                                            mainChoice = 0;
                                        }
                                        else if (subSubSubChoice == 5)
                                        {
                                            //exit
                                            subChoice = 0;
                                            mainChoice = 4;
                                        }
                                    }
                                    else
                                    {
                                        System.out.println("You already have taken this quiz.");
                                    }
                                }
                                else if (subSubChoice == 6)
                                {
                                    System.out.println("Tech-related bonus");
                                    System.out.println("\nPeople around the world are in constant looming fear of having their job security taken away by automation. Automation is the technology by which a process or procedure \n" +
                                            "is done with minimal human assistance. Business Insider reports that tech leaders and financiers are “confident that self-driving trucks will be the norm as early as 2020”. \n" +
                                            "What is holding this specific section of automation is safety concerns, new lawmaking and public pushback due to job concerns. In response to job concerns, some people are \n" +
                                            "suggesting a rapid shift in the job force and future education towards knowledge-based and STEM-focused careers, others suggest a universal basic income where the government \n" +
                                            "pays you your wages and you don’t have to work, others suggest outright banning automation or forcing companies to employ humans. Will we see a joyous future void of work, \n" +
                                            "or are we on the brink of a new Great Depression? Or was Henry David Thoreau right when he said “Lo! Men have become the tools of their tools.");
                                    System.out.println("---------------");
                                    System.out.println("1. Back to Learn About Menu\n2. Quiz Yourself\n3. Back to Start Game Menu\n4. Back to Main Menu\n5. Exit");
                                    System.out.println("---------------");
                                    System.out.print("What would you like to do? ");
                                    subSubSubChoice = input.nextInt();
                                    System.out.println("---------------");

                                    if (counterQ6==0)
                                    {
                                        if (subSubSubChoice == 2)
                                        {
                                            counterQ6++;
                                            System.out.println("Question 1: According to the experts, automation will start taking jobs in ____?");
                                            System.out.println("\t1. 2020\n" +
                                                    "\t2. 2100\n" +
                                                    "\t3. 2000\n" +
                                                    "\t4. 2150");
                                            System.out.println("---------------");
                                            System.out.print("What is your answer? ");
                                            quizAnswer = input.nextInt();
                                            System.out.println("---------------");
                                            if (quizAnswer==1)
                                            {
                                                questionRight++;
                                                //additional salary range between 10k and 20k
                                                userMoney += (20000-10000+1)*Math.random()+10000;
                                                System.out.println("Correct");
                                            }
                                            else
                                            {
                                                System.out.println("Incorrect");
                                            }
                                            System.out.println("Your estimated salary: " + money.format(userMoney));
                                            System.out.println("---------------");
                                            totalQuestion++;
                                            System.out.println("Question 2: Which of the following are suggestions for dealing with automation?");
                                            System.out.println("\t1. Destroying all robots\n" +
                                                    "\t2. Universal basic income\n" +
                                                    "\t3. Making new jobs\n" +
                                                    "\t4. Socialism");
                                            System.out.println("---------------");
                                            System.out.print("What is your answer? ");
                                            quizAnswer = input.nextInt();
                                            System.out.println("---------------");
                                            if (quizAnswer==2)
                                            {
                                                questionRight++;
                                                //additional salary range between 10k and 20k
                                                userMoney += (20000-10000+1)*Math.random()+10000;
                                                System.out.println("Correct");
                                            }
                                            else
                                            {
                                                System.out.println("Incorrect");
                                            }
                                            System.out.println("Your estimated salary: " + money.format(userMoney));
                                            System.out.println("---------------");
                                            totalQuestion++;
                                            System.out.println("Question 3: Why aren’t all trucks self-driven by now?");
                                            System.out.println("\t1. Technology doesn’t exist\n" +
                                                    "\t2. No one uses trucks anymore\n" +
                                                    "\t3. Safety concerns\n" +
                                                    "\t4. We have to wait a decade");
                                            System.out.println("---------------");
                                            System.out.print("What is your answer? ");
                                            quizAnswer = input.nextInt();
                                            System.out.println("---------------");
                                            if (quizAnswer==3)
                                            {
                                                questionRight++;
                                                //additional salary range between 10k and 20k
                                                userMoney += (20000-10000+1)*Math.random()+10000;
                                                System.out.println("Correct");
                                            }
                                            else
                                            {
                                                System.out.println("Incorrect");
                                            }
                                            System.out.println("Your estimated salary: " + money.format(userMoney));
                                            System.out.println("---------------");
                                            totalQuestion++;
                                        }
                                        else if (subSubSubChoice == 3)
                                        {
                                            //back to start game menu
                                            subChoice = 0;
                                            mainChoice = 1;
                                        }
                                        else if (subSubSubChoice == 4)
                                        {
                                            //back to main menu
                                            subChoice = 0;
                                            mainChoice = 0;
                                        }
                                        else if (subSubSubChoice == 5)
                                        {
                                            //exit
                                            subChoice = 0;
                                            mainChoice = 4;
                                        }
                                    }
                                    else
                                    {
                                        System.out.println("---------------");
                                        System.out.println("You already have taken this quiz. Please choose a different topic.");
                                        System.out.println("---------------");
                                    }
                                }
                                else if (subSubChoice == 7)
                                {
                                    //back to start game menu
                                    subChoice = 0;
                                    mainChoice = 1;
                                }
                                else if (subSubChoice == 8)
                                {
                                    //back to main menu
                                    subChoice = 0;
                                    mainChoice = 0;
                                }
                                else if (subSubChoice == 9)
                                {
                                    //exit
                                    subChoice = 0;
                                    mainChoice = 4;
                                }

                                if (bonusCounter==0)
                                {
                                    if (questionRight>=12 && totalQuestion==18)
                                    {
                                        System.out.println("Your estimated salary is " + money.format(userMoney));
                                        System.out.println("---------------");
                                        System.out.println("Congratulation you are at the bonus stage! You can only enter the bonus stage now! Test your luck!\n\t1. Enter Bonus Stage\n\t2. Back to Start Game Menu\n\t3. Back to Main Menu\n\t4. Exit");
                                        System.out.println("---------------");
                                        System.out.print("What would you like to do? ");
                                        subSubSubChoice = input.nextInt();
                                        System.out.println("---------------");
                                        if (subSubSubChoice == 1)
                                        {
                                            System.out.println("Random number from 0 to 5000 will be added to your estimated salary!");
                                            bonusRound = (int)((5001)*Math.random());
                                            System.out.println("You gain extra " + money.format(bonusRound) + "!");
                                            userMoney += bonusRound;
                                        }
                                        else if (subSubSubChoice == 2)
                                        {
                                            //back to start game menu
                                            subChoice = 0;
                                            mainChoice = 1;
                                        }
                                        else if (subSubSubChoice == 3)
                                        {
                                            //back to main menu
                                            subChoice = 0;
                                            mainChoice = 0;
                                        }
                                        else if (subSubSubChoice == 4)
                                        {
                                            //exit
                                            subChoice = 0;
                                            mainChoice = 4;
                                        }
                                        System.out.println("---------------");
                                        System.out.println("Your final estimated salary is: " + money.format(userMoney));
                                        System.out.println("---------------");
                                        bonusCounter++;
                                    }
                                    else if (questionRight<12 && totalQuestion==18)
                                    {
                                        System.out.println("Your estimated salary is " + money.format(userMoney));
                                        System.out.println("---------------");
                                    }
                                }
                            }
                        }while (subChoice==1);

                        if (subChoice==2)
                        {
                            //back to main menu
                            mainChoice = 0;
                        }
                        else if (subChoice==3)
                        {
                            //exit
                            mainChoice = 4;
                        }
                    }
                    else if (mainChoice==2)
                    {
                        System.out.println("Instruction");
                        System.out.println("\n1. The goal of this game is to get an estimated salary. More questions right, salary increases." +
                                "\n2. Type 1 to start game when you are at Main Menu." +
                                "\n3. Type 1 to learn about computer hardware." +
                                "\n4. Choose a topic to learn about by entering the number beside the topic." +
                                "\n5. Type 2 to quiz yourself." +
                                "\n6. Every correct answer adds $10 000 to an estimated salary." +
                                "\n7. Tech-related bonus can give salary between $10 000 and $20 000." +
                                "\n8. There could be a bonus round depending on how well you do and total number of questions." +
                                "\n9. Good luck and have fun!");
                        System.out.println("---------------");
                        System.out.println("\t1. Back to Main Menu\n\t2. Exit");
                        System.out.println("---------------");
                        System.out.print("What would you like to do? ");
                        subChoice = input.nextInt();
                        System.out.println("---------------");
                        if (subChoice==1)
                            mainChoice = 0;
                        else if (subChoice==2)
                            mainChoice = 4;
                    }
                    else if (mainChoice==3)
                    {
                        System.out.println("About Program");
                        System.out.println("\nWelcome to Peter and Ayo’s Microsoft Training Simulator. You know when Peter and I decided to leave Microsoft after 25 years, it was a hard decision to make. We were both \n" +
                                "making tons of money and solving challenging problems. That may have been enough for some, but not for us. We wanted to make a change, to help others. And we decided to do \n" +
                                "it through what were best at. That’s how we came up with this training simulator, we wanted to share the knowledge, we gained after decades in the industry in hopes of \n" +
                                "putting people in the position we once were. Through a lot of long nights coding and even longer ones writing down our knowledge we were able to come up with a \n" +
                                "comprehensive guide on computer hardware. We did our best not to pigeon hole ourselves into only being a job training simulator and hope people of all ages, professions, \n" +
                                "and nationalities can enjoy learning about the hardware we hold close to our hearts. Thank you for playing. Then a super large signature at the end.");
                        System.out.println("---------------");
                        System.out.println("\t1. Back to Main Menu\n\t2. Exit");
                        System.out.println("---------------");
                        System.out.print("What would you like to do? ");
                        subChoice = input.nextInt();
                        System.out.println("---------------");
                        if (subChoice==1)
                            mainChoice = 0;
                        else if (subChoice==2)
                            mainChoice = 4;
                    }
                } while (mainChoice == 1);
            }
        }while (mainChoice!=4);
    }
}