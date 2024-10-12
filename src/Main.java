//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //2.5
        int n = 7;
        int days = 234;
        int week = 234/7;
        System.out.println(week);
        //2.6
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt(); //кол-во секунд
        int h = n1/3600;
        System.out.println(h + " полных часа/часов с начала суток");
        int x = n1/3600; // целочисленное деление, находи кол-во целых часов
        int y = n1 - x*3600; // остаток секунд с последнего полного часа
        int b = y/60;
        System.out.println("Кол-во минут: " + b);
        int x1 = n1/60; //кол-во целых минут
        int b1 = n1 - x1*60;
        System.out.println("Кол-во секунд: " + b1);
        //2.13
        int main1 = sc.nextInt();
        int u1 = main1/100;//нашли сотни
        int u2 = (main1/10)%10; //нашли десятки
        int u3 = main1%10;//нашли десятки
        System.out.println(u3*100 + u2*10 + u1);
        //2.19
        int main2= sc.nextInt();
        int q1 = main2%10;//4
        int q2 = (main2/10)%10;//3
        int q3 = (main2/100)%10;//2
        int q4 = main2/1000;//1
        int sum = q1+q2+q3+q4;
        int mul = q1*q2*q3*q4;
        System.out.println("Сумма: " + sum + " " + "Произведение: " + mul);
        //4.9
        System.out.print("Введите число: ");
        int km = sc.nextInt();
        System.out.print("Введите число: ");
        int sec = sc.nextInt();
        int sec2 = km*1000/3600;
        if(sec2>sec){
            System.out.println("Значение, данное в км/ч больше");
        } else if(sec2<sec) {
            System.out.println("Значение, данное в м/с больше");
        } else if(sec2==sec) {
            System.out.println("Значения равны");
        }
        //4.10
        int R1 = sc.nextInt();//радиус
        int L1 = sc.nextInt();//сторона
        double S1 = 3.14 * R1 * R1;
        int S2 = L1 *L1;
        if(S1>S2){
            System.out.println("Площадь круга больше");
        } else if (S1<S2) {
            System.out.println("Площадь квадрата больше");
        } else if (S1==S2){
            System.out.println("Площадь квадрата больше");
        }
        //4.13
        System.out.print("Введите число: ");
        float a10 = sc.nextInt();
        System.out.print("Введите число: ");
        float b10 = sc.nextInt();
        System.out.print("Введите число: ");
        float c10 = sc.nextInt();
        float D = (b10 * b10) - (4 * a10 * c10);
        if (D>0) {
            System.out.println("Уравнение имеет ровно 2 корня");
        }
        else if(D<0) {
            System.out.println("Уравнение не имеет корней");
        }
        else if(D==0) {
            System.out.println("Уравнение имеет ровно один корень");
        }
        //4.96
        System.out.print("Введите число: ");
        float a11 = sc.nextInt();
        System.out.print("Введите число: ");
        float b11 = sc.nextInt();
        System.out.print("Введите число: ");
        float c11 = sc.nextInt();
        float D1 = (b11 * b11) - (4 * a11 * c11);
        if (D1>0) {
            double x11 = (-b11 - Math.sqrt(D1)) / 2*a11;
            double x12 = (-b11 + Math.sqrt(D1)) / 2*a11;
            System.out.println("x1 = " + x11 + " " +"x2 = " + x12);
        }
        else if(D1<0) {
            System.out.println("Уравнение не имеет корней");
        }
        else if(D1==0) {
            float x11 = -b11 / 2*a11;
            System.out.println("x1 = " + x11);
        }
        //4.97
        System.out.print("Введите число: ");
        int V = sc.nextInt();
        System.out.print("Введите число: ");
        int P = sc.nextInt();
        System.out.print("Введите число: ");
        int F = sc.nextInt();
        int max = V;
        if (P > max) {
            max = P;
        }
        if (F > max) {
            max = F;
        }
        if (max == V) {
            System.out.println("Первое число самое большое");
        } else if (max == P) {
            System.out.println("Второе число самое большое");
        } else if (max == F) {
            System.out.println("Третье число самое большое");
        }
        int min = V;
        if (P < min) {
            min = P;
        }
        if (F < min) {
            min = F;
        }
        if (min == V) {
            System.out.println("Первое число самое маленькое");
        } else if (min == P) {
            System.out.println("Второе число самое маленнькое");
        } else if (min == F) {
            System.out.println("Третье число самое маленькое");
        }
        if (V > min && V < max) {
            System.out.println("Первое число является средним");
        } else if (P > min && P < max) {
            System.out.println("Второе число является средним");
        } else {
            System.out.println("Третье число явялется средним");
        }
        System.out.print("Введите число: ");
        int a15 = sc.nextInt();
        System.out.print("Введите число: ");
        int b15 = sc.nextInt();
        System.out.print("Введите число: ");
        int c15 = sc.nextInt();
        if (a15+b15>c15 && a15+c15>b15 && c15+b15>a15) {
            System.out.println("треугольник существует");
        }
        else {
            System.out.println("треугольник не существует");
        }
        //766
        System.out.print("Введите число: ");
        int N = sc.nextInt();
        System.out.print("Введите число: ");
        int M = sc.nextInt();
        System.out.print("Введите число: ");
        int K = sc.nextInt();
        int or = M*N; //кол-во орешков, которое собрала белочка
        if(or >= K) {
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }
        //195
        System.out.print("Введите число: ");
        int N1 = sc.nextInt();
        System.out.print("Введите число: ");
        int A = sc.nextInt();
        System.out.print("Введите число: ");
        int B = sc.nextInt();
        float M1 = A*B; //площадь панели
        float S3 = M1 * 2 * 1 * N1;
        System.out.print(S3);
        //773
        System.out.print("Введите коэффииент величины Гуливера: ");
        int K5 = sc.nextInt();
        System.out.print("Введите количество слоев матрасов: ");
        int M5 = sc.nextInt();
        int M6 = K5*K5*M5;
        System.out.println(M6);
        //21
        System.out.print("Введите з/п первого сотрудника: ");
        int Zp1 = sc.nextInt();
        System.out.print("Введите з/п второго сотрудника: ");
        int Zp2 = sc.nextInt();
        System.out.print("Введите з/п третьего сотрудника: ");
        int Zp3 = sc.nextInt();
        int max15 = Zp1;
        if (Zp2 > max15) {
            max15 = Zp2;
        }
        if (Zp3 > max15) {
            max15 = Zp3;
        }
        int min15 = Zp1;
        if (Zp2 < min15){
            min15 = Zp2;
        }
        if (Zp3 < min15) {
            min15 = Zp3;
        }
        int razn = max15 - min15;
        System.out.println(razn);
        //4
        System.out.print("Введите число: ");
        int g1 = sc.nextInt();
        int g2 = 9;
        int g3 = 9-g1;
        System.out.println(g1*100 + g2*10 + g3);
        //8
        System.out.print("Введите множитель: ");
        int A19 = sc.nextInt();
        System.out.print("Введите множитель: ");
        int B19 = sc.nextInt();
        System.out.print("Введите произведение: ");
        int C19 = sc.nextInt();
        if (A19*B19 == C19) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}