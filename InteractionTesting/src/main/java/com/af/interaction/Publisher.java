package com.af.interaction;

import java.util.ArrayList;
import java.util.List;

public class Publisher {
	List<Subscriber> subscribers = new ArrayList<>();
	int messageCount = 0;

	void send(String message){
	    subscribers.forEach(item->item.receive(message));
	    messageCount++;
	}
}
