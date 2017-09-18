package com.hlcsdev.x.exchangerates;


import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;



@Root(name = "Valute")
public class Valute
{
    @Attribute(name="ID")
    private String id;

    @Element(name = "NumCode")
    private String numCode;

    @Element(name = "CharCode")
    private String charCode;

    @Element(name = "Nominal")
    private String nominal;

    @Element(name = "Name")
    private String name;

    @Element(name = "Value")
    private String value;


    public String getId()
    {
        return id;
    }

    public String getNumCode ()
    {
        return numCode;
    }

    public String getCharCode ()
    {
        return charCode;
    }

    public String getNominal ()
    {
        return nominal;
    }

    public String getName ()
    {
        return name;
    }

    public String getValue ()
    {
        return value;
    }





}
