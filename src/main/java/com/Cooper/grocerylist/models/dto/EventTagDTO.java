package com.Cooper.grocerylist.models.dto;

import com.sun.istack.NotNull;
import jdk.jfr.Event;
import org.aspectj.apache.bcel.generic.Tag;

public class EventTagDTO {

    @NotNull
    private Event event;

    @NotNull
    private Tag tag;

    public EventTagDTO() {}

    public Event getEvent() {
        return event;
    }

    public void setEvent(Event event) {
        this.event = event;
    }

    public Tag getTag() {
        return tag;
    }

    public void setTag(Tag tag) {
        this.tag = tag;
    }
}
