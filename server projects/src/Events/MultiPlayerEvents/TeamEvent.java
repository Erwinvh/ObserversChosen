package Events.MultiPlayerEvents;

import Events.Event;

public interface TeamEvent extends Event {

        int getMaxTeamSize();

        int getMinimalTeamSize();


}
