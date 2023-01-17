package roon.architecture.patterns.clean_arch.solid.srp;

import lombok.Getter;

import java.util.Map;

@Getter
public class InventoryDataSource {
    private Map<String, Integer> inventory = Map.of("id1", 10, "id2", 20);
}
