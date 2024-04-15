package dev.Ningappa.EcommProductService.dto;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class FakeStroreProductRatingDTO {


    private double rate;
    private int count;
    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }


}
