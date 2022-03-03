package net.olileisinger.beecraftmod.item.custom;

import net.minecraft.item.Item;
import team.reborn.energy.api.EnergyStorage;
import team.reborn.energy.api.base.SimpleBatteryItem;

public class BeecraftBattery extends Item implements SimpleBatteryItem {
    private long capacity;
    private final long inputMax;
    private final long outputMax;

    public BeecraftBattery(Settings _settings, long _cap, long _input, long _output) {
        super(_settings);
        this.capacity = _cap;
        this.inputMax = _input;
        this.outputMax = _output;
    }

    public long getEnergyCapacity(){
        return capacity;
    }

    @Override
    public long getEnergyMaxInput() {
        return inputMax;
    }

    @Override
    public long getEnergyMaxOutput() {
        return outputMax;
    }
}
