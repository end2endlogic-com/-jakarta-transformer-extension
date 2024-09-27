package com.end2endlogic.jakarta.transformer.extension.deployment;

import io.quarkus.deployment.annotations.BuildStep;
import io.quarkus.deployment.builditem.FeatureBuildItem;

class JakartaTransformerExtensionProcessor {

    private static final String FEATURE = "jakarta-transformer-extension";

    @BuildStep
    FeatureBuildItem feature() {
        return new FeatureBuildItem(FEATURE);
    }
}
