# Втора лабораториска вежба по Софтверско инженерство
## Дијана Манчева,193012
### Control flow graph
![control flow graph lab2](https://user-images.githubusercontent.com/80008763/120233178-0a1bfd00-c20a-11eb-8919-62462ec7bff3.PNG)
### 2.Цикломатската комплексност изнесува 3.Тоа го пресметав со тоа што бројот на ребра го одземав од бројот на јазли и додадов 2,односнно Е-V+2.
### 3.Multiple conditions
If(h1<0 || hr>24) <br />
T X <br />
F T <br />
if (min < 0 || min > 59) <br />
T X  
F T  
F F  

else if (hr == 24 && min == 0 && sec == 0) <br />
T T T <br />
T T F <br />
T F X <br />
F X X <br />



    @Test
    void multipleCondition() {
        RuntimeException re;
        //Невалидни часови
        re = assertThrows(RuntimeException.class, () -> SILab2.function(createList(new Time(-20, 57, 30))));
        re = assertThrows(RuntimeException.class, () -> SILab2.function(createList(new Time(30, 2, 31))));
        //Невалидни минути
        re = assertThrows(RuntimeException.class, () -> SILab2.function(createList(new Time(10, -15, 3))));
        re = assertThrows(RuntimeException.class, () -> SILab2.function(createList(new Time(10, 95, 30))));
        //Невалидни секунди
        re = assertThrows(RuntimeException.class, () -> SILab2.function(createList(new Time(10, 20, 111))));
        re = assertThrows(RuntimeException.class, () -> SILab2.function(createList(new Time(10, 20, -90))));
        //Невалидно време
        re = assertThrows(RuntimeException.class, () -> SILab2.function(createList(new Time(24, 10, 50))));
        re = assertThrows(RuntimeException.class, () -> SILab2.function(createList(new Time(28, 10, 90))));

        assertEquals(returnList(36315), SILab2.function(createList(new Time(12, 3, 25))));

    }
}

### 4.Објаснување за тест случаите според Multiple conditions
За овие тест случаи ги употребив методите за претпоставки assertThrows и assertEquals

