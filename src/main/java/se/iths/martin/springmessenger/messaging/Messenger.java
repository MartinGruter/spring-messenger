package se.iths.martin.springmessenger.messaging;

import se.iths.martin.springmessenger.model.Message;

public interface Messenger {
    void send(Message message);

}
