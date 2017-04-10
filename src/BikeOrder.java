package tryit;

public class BikeOrder {

    private String order = "";

    public String getOrder()
    {
        return order;
    }

    public void validateOrder(String bikeModel, int quantity)
            throws TooManyBikesException {

        if(("Comanche".equals(bikeModel) && (quantity < 10)) ||
                ("Украина".equals(bikeModel) && (quantity < 12)) ||
                ("Аист".equals(bikeModel) && (quantity < 17)) ||
                ("Мишка".equals(bikeModel) && (quantity < 20)))
        {
            order = "Заказано: " + bikeModel +
                    ": " + quantity;
        }
        else
        {
            throw new TooManyBikesException("Нельзя заказать " + quantity +
                    " " + bikeModel + " велосипедов.");
        }

    }
}