package ru.skillfactorydemo.tgbot.dto;

import lombok.Data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.datatype.XMLGregorianCalendar;

@XmlRootElement(name = "GetCursOnDateXML", namespace = "http://web.cbr.ru/")
@XmlAccessorType(XmlAccessType.FIELD)
@Data
public class GetCursOnDateXML {

    public void setOnDate(XMLGregorianCalendar onDate) {
        this.onDate = onDate;
    }

    @XmlElement(name = "On_date", required = true, namespace = "http://web.cbr.ru/")
    protected XMLGregorianCalendar onDate;

}