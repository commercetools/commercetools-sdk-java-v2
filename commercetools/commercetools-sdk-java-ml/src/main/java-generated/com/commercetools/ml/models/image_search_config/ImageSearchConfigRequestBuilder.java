
package com.commercetools.ml.models.image_search_config;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class ImageSearchConfigRequestBuilder implements Builder<ImageSearchConfigRequest> {

    private java.util.List<com.commercetools.ml.models.image_search_config.ImageSearchConfigUpdateAction> actions;

    public ImageSearchConfigRequestBuilder actions(
            final com.commercetools.ml.models.image_search_config.ImageSearchConfigUpdateAction... actions) {
        this.actions = new ArrayList<>(Arrays.asList(actions));
        return this;
    }

    public ImageSearchConfigRequestBuilder actions(
            final java.util.List<com.commercetools.ml.models.image_search_config.ImageSearchConfigUpdateAction> actions) {
        this.actions = actions;
        return this;
    }

    public ImageSearchConfigRequestBuilder plusActions(
            final com.commercetools.ml.models.image_search_config.ImageSearchConfigUpdateAction... actions) {
        if (this.actions == null) {
            this.actions = new ArrayList<>();
        }
        this.actions.addAll(Arrays.asList(actions));
        return this;
    }

    public ImageSearchConfigRequestBuilder plusActions(
            Function<com.commercetools.ml.models.image_search_config.ImageSearchConfigUpdateActionBuilder, Builder<? extends com.commercetools.ml.models.image_search_config.ImageSearchConfigUpdateAction>> builder) {
        if (this.actions == null) {
            this.actions = new ArrayList<>();
        }
        this.actions.add(
            builder.apply(com.commercetools.ml.models.image_search_config.ImageSearchConfigUpdateActionBuilder.of())
                    .build());
        return this;
    }

    public ImageSearchConfigRequestBuilder withActions(
            Function<com.commercetools.ml.models.image_search_config.ImageSearchConfigUpdateActionBuilder, Builder<? extends com.commercetools.ml.models.image_search_config.ImageSearchConfigUpdateAction>> builder) {
        this.actions = new ArrayList<>();
        this.actions.add(
            builder.apply(com.commercetools.ml.models.image_search_config.ImageSearchConfigUpdateActionBuilder.of())
                    .build());
        return this;
    }

    public java.util.List<com.commercetools.ml.models.image_search_config.ImageSearchConfigUpdateAction> getActions() {
        return this.actions;
    }

    public ImageSearchConfigRequest build() {
        Objects.requireNonNull(actions, ImageSearchConfigRequest.class + ": actions is missing");
        return new ImageSearchConfigRequestImpl(actions);
    }

    /**
     * builds ImageSearchConfigRequest without checking for non null required values
     */
    public ImageSearchConfigRequest buildUnchecked() {
        return new ImageSearchConfigRequestImpl(actions);
    }

    public static ImageSearchConfigRequestBuilder of() {
        return new ImageSearchConfigRequestBuilder();
    }

    public static ImageSearchConfigRequestBuilder of(final ImageSearchConfigRequest template) {
        ImageSearchConfigRequestBuilder builder = new ImageSearchConfigRequestBuilder();
        builder.actions = template.getActions();
        return builder;
    }

}
