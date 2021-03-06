package edu.miracostacollege.cs112.ic16_influencersfx.model;

import java.io.Serializable;
import java.util.Objects;

public class CEO extends Influencer implements Serializable
{
    private String mCompany;

    public CEO(String name, String country, int followers, double worth, String mCompany)
    {
        super(name, country, followers, worth);
        this.mCompany = mCompany;
    }

    public String getCompany()
    {
        return mCompany;
    }

    public void setCompany(String mCompany)
    {
        this.mCompany = mCompany;
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        CEO ceo = (CEO) o;
        return Objects.equals(mCompany, ceo.mCompany);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), mCompany);
    }

    @Override
    public String toString() {
        return "CEO{" +
                "mCompany='" + mCompany + '\'' +
                ", mName='" + mName + '\'' +
                ", mCountry='" + mCountry + '\'' +
                ", mFollowers=" + number.format(mFollowers) +
                ", mWorth=" + currency.format(mWorth) +
                '}';
    }
}
