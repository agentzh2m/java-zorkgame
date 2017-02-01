package io.muic.ooc;

import io.muic.ooc.units.HamMinion;
import io.muic.ooc.units.Pj;

public class UnitFactory {
    public static Unit getUnit(String unit){
        switch (unit){
            case "pj": return new Pj();
            case "ham-minion": return new HamMinion();
            default: return null;
        }
    }
}
