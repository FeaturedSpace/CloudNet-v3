package de.dytanic.cloudnet.ext.bridge.bukkit.event;

import de.dytanic.cloudnet.driver.service.ServiceInfoSnapshot;
import org.bukkit.event.HandlerList;
import org.jetbrains.annotations.NotNull;

public final class BukkitCloudServiceStartEvent extends BukkitCloudNetEvent {

    private static final HandlerList handlerList = new HandlerList();

    private final ServiceInfoSnapshot serviceInfoSnapshot;

    public BukkitCloudServiceStartEvent(ServiceInfoSnapshot serviceInfoSnapshot) {
        this.serviceInfoSnapshot = serviceInfoSnapshot;
    }

    public static HandlerList getHandlerList() {
        return BukkitCloudServiceStartEvent.handlerList;
    }

    @NotNull
    @Override
    public HandlerList getHandlers() {
        return handlerList;
    }

    public ServiceInfoSnapshot getServiceInfoSnapshot() {
        return this.serviceInfoSnapshot;
    }
}