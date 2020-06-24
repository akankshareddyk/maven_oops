package com.epam.giftshop;

import com.epam.giftshop.chocolates.Chocolate;
import com.epam.giftshop.chocolates.Kitkat;
import com.epam.giftshop.chocolates.Reeses;
import com.epam.giftshop.chocolates.Snickers;
import com.epam.giftshop.sweets.GulabJamun;
import com.epam.giftshop.sweets.Jalebi;
import com.epam.giftshop.sweets.Rasmalai;
import com.epam.giftshop.sweets.Sweet;

public final class Database {
    public static final Chocolate[] chocolates = {
            new Kitkat("Kitkat", 10.50f, 15.0f),
            new Reeses("Reeses", 50.75f, 13.06f),
            new Snickers("Snickers", 60.25f, 30.0f)
    };
    public static final Sweet[] sweets = {
            new GulabJamun("GulabJamun", 45.0f, 20.5f),
            new Jalebi("Jalebi", 20.0f, 30),
            new Rasmalai("Rasmalai", 10, 20)
    };


}