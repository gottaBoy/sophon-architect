package com.zeron.sophon.extension;

import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

/**
 * ExtensionRepository
 */
@Component
public class ExtensionRepository {

    public Map<ExtensionCoordinate, IExtensionPoint> getExtensionRepo() {
        return extensionRepo;
    }

    private Map<ExtensionCoordinate, IExtensionPoint> extensionRepo = new HashMap<>();


}
