package org.bartos.spi.core;


import org.bartos.spi.common.BartSession;
import org.bartos.spi.core.model.home.HomeProvider;
import org.bartos.spi.core.model.room.RoomProvider;

public interface BartHomeSession extends BartSession {

    HomeProvider homes();

    RoomProvider rooms();
}
