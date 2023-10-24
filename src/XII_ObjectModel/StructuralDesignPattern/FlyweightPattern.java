package XII_ObjectModel.StructuralDesignPattern;

//When too many objects are created we may observe a pattern of repetition. So we create the object of the already predicted repetition and reuse it everytime and hence space.

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

//Flyweight Interface
interface Ticket {
    public void printTicket();

    public void cancelTicket();
}

//Flyweight Concrete Class 1
class BookTrain implements Ticket {
    private String name;
    private int age;
    private String seat;
    private TrainSeatDetail seatDetail;
    private boolean isCanceled = false;

    BookTrain(String name, int age, String seat, TrainSeatDetail seatDetail) {
        this.name = name;
        this.age = age;
        this.seat = seat;
        this.seatDetail = seatDetail;
    }

    @Override
    public void printTicket() {
        System.out.println("\n\nTICKET DETAIL:\n" + "Name: " + this.name + "\nAge: " + this.age + "\nSeat: " + this.seat + "\nCart: " + this.seatDetail.getCart() + "\nMeal: " + this.seatDetail.isMeal() + "\nBeading: " + this.seatDetail.isBeading());
    }

    @Override
    public void cancelTicket() {
        this.isCanceled = true;
        System.out.println("Your ticket is canceled");
    }
}

//Flyweight Class 1
class TrainSeatDetail {
    private String cart;
    private boolean meal;
    private boolean beading;

    TrainSeatDetail(String cart, boolean meal, boolean beading) {
        this.cart = cart;
        this.meal = meal;
        this.beading = beading;
    }

    public String getCart() {
        return cart;
    }

    public boolean isMeal() {
        return meal;
    }

    public boolean isBeading() {
        return beading;
    }
}

class FlyweightFactory {
    HashMap<String, TrainSeatDetail> trainCache = new HashMap<>();

    public Object ticketFactory(boolean isTrain, String name, int age, String seat, String category, boolean meal, boolean beading) {
        TrainSeatDetail trainSeatDetail = null;
        for (Map.Entry<String, TrainSeatDetail> entry : trainCache.entrySet()) {
            if (entry.getValue().getCart() == category && entry.getValue().isMeal() == meal && entry.getValue().isBeading() == beading) {
                trainSeatDetail = entry.getValue();
                System.out.print("cacheCall ");
                break;
            }
        }
        if (trainSeatDetail == null) {
            trainSeatDetail = new TrainSeatDetail(category, meal, beading);
            trainCache.put(UUID.randomUUID().toString(), trainSeatDetail);
        }
        return new BookTrain(name, age, seat, trainSeatDetail);
    }
}

public class FlyweightPattern {
    public static void main(String[] args) {
        FlyweightFactory factory = new FlyweightFactory();

        BookTrain trainTicket1 = (BookTrain) factory.ticketFactory(true, "Sayan Banerjee", 21, "32", "A", true, true);
        BookTrain trainTicket2 = (BookTrain) factory.ticketFactory(true, "Shreyan Prakash", 20, "33", "A", true, true);
        BookTrain trainTicket3 = (BookTrain) factory.ticketFactory(true, "Soumyadip Roy", 20, "33", "A", true, true);

        trainTicket1.printTicket();
        trainTicket2.printTicket();
        trainTicket3.printTicket();
    }
}
