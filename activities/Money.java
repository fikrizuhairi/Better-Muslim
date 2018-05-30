package com.alexvasilkov.foldablelayout.sample.activities;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

/**
 * Created by Fikri Zuhairi on 26/4/2018.
 */

public class Money {

    public String money(int money){
        //convert myr
        String myr;
        DecimalFormat ringgitMalaysia = (DecimalFormat) DecimalFormat.getCurrencyInstance();
        DecimalFormatSymbols formatMyr = new DecimalFormatSymbols();

        formatMyr.setCurrencySymbol("");
        formatMyr.setMonetaryDecimalSeparator('.');
        formatMyr.setGroupingSeparator('.');

        ringgitMalaysia.setDecimalFormatSymbols(formatMyr);
        myr = ringgitMalaysia.format(money);
        return myr;
    }
}
