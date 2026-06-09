package xyz.jambon.pvgtcore.main.GT.matelem;

import com.gregtechceu.gtceu.api.data.chemical.Element;
import com.gregtechceu.gtceu.api.registry.GTRegistries;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

public class PVElements {

    public static Element ANULIUM;
    public static Element GURGLIUM;
    public static Element PRIMORDIUM;
    public static Element ENERGIUM;
    public static Element ENGERIOPHAGE;

    public static Element MANA;
    public static Element ALFMANA;
    public static Element SPIRIT;

    private static final Map<String, Element> LOOKUP = new HashMap<>();

    public static void init() {
        ANULIUM = create("anulium", "ø", 1, 1, -1, null, false);
        GURGLIUM = create("gurglium", "Þ", 1, 1, -1, null, false);
        PRIMORDIUM = create("primordium", "¤", 1, 1, -1, null, false);
        ENERGIUM = create("energium", "⚡", 1, 1, -1, null, false);
        ENGERIOPHAGE = create("engeriophage", "ð", 1, 1, -1, null, false);

        MANA = create("mana", "Ma", 1, 1, -1, null, false);
        ALFMANA = create("alfmana", "Af", 1, 1, -1, null, false);
        SPIRIT = create("spirit", "Sp", 1, 1, -1, null, false);

        for (Field f : PVElements.class.getFields()) {
            if (f.getType() == Element.class) {
                try {
                    LOOKUP.put(f.getName().toLowerCase(), (Element) f.get(null));
                } catch (Exception ignored) {}
            }
        }
    }

    public static Element get(String name) {
        Element element = LOOKUP.get(name.toLowerCase());
        if (element == null)
            throw new IllegalArgumentException("Unknown element: " + name);
        return element;
    }

    private static Element create(String id, String symbol, long protons, long neutrons,
                                  long halfLife, String decayTo, boolean isIsotope) {
        Element element = new Element(protons, neutrons, halfLife, decayTo, id, symbol, isIsotope);
        GTRegistries.ELEMENTS.register(id, element);
        return element;
    }
}
