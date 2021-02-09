import java.util.*;
import java.util.stream.Collectors;
import java.util.function.Function;


public class Main {

    private static List<Square> kształty;

    public static void main(String[] args) {

        kształty = Arrays.asList(
                new Square(2),
                new Square(6),
                new Square(8),
                new Square(12),
                new Square(46),
                new Square(24),
                new Square(16),
                new Square(9),
                new Square(11),
                new Square(17),
                new Square(66),
                new Square(122),
                new Square(81),
                new Square(3),
                new Square(156),
                new Square(199),
                new Square(222),
                new Square(23),
                new Square(123),
                new Square(321)
        );

        List<Square> zad_a = kształty.stream().filter(a->a.getArea()<a.getPerimeter() ).collect(Collectors.toList());
        List<Square> zad_b = kształty.stream().sorted(Comparator.comparingDouble(Square::getArea)).collect(Collectors.toList());
        List<Square> zad_c = kształty.stream().sorted(Comparator.comparingDouble(Square::getPerimeter).reversed()).collect(Collectors.toList());
        Double zad_d = kształty.stream().mapToDouble(Rectangle::getPerimeter).average().orElse(Double.NaN);
        Double zad_e = kształty.stream().mapToDouble(Rectangle::getArea).sum();
        Map<Double, Rectangle> mapa = kształty.stream().collect(Collectors.toMap(Rectangle::getArea, Function.identity()));
    }
}