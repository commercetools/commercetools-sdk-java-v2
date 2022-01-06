
package com.commercetools.api.models.message;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class ContainerAndKeyBuilder implements Builder<ContainerAndKey> {

    private String key;

    private String container;

    public ContainerAndKeyBuilder key(final String key) {
        this.key = key;
        return this;
    }

    public ContainerAndKeyBuilder container(final String container) {
        this.container = container;
        return this;
    }

    public String getKey() {
        return this.key;
    }

    public String getContainer() {
        return this.container;
    }

    public ContainerAndKey build() {
        Objects.requireNonNull(key, ContainerAndKey.class + ": key is missing");
        Objects.requireNonNull(container, ContainerAndKey.class + ": container is missing");
        return new ContainerAndKeyImpl(key, container);
    }

    /**
     * builds ContainerAndKey without checking for non null required values
     */
    public ContainerAndKey buildUnchecked() {
        return new ContainerAndKeyImpl(key, container);
    }

    public static ContainerAndKeyBuilder of() {
        return new ContainerAndKeyBuilder();
    }

    public static ContainerAndKeyBuilder of(final ContainerAndKey template) {
        ContainerAndKeyBuilder builder = new ContainerAndKeyBuilder();
        builder.key = template.getKey();
        builder.container = template.getContainer();
        return builder;
    }

}
