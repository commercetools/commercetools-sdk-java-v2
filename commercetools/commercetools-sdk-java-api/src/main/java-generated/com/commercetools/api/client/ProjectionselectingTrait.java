
package com.commercetools.api.client;

import java.util.List;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProjectionselectingTrait
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public interface ProjectionselectingTrait<T extends ProjectionselectingTrait<T>> {
    List<String> getStaged();

    /**
     * set staged with the specificied value
     */
    <TValue> ProjectionselectingTrait<T> withStaged(final TValue staged);

    /**
     * add additional staged query parameter
     */
    <TValue> ProjectionselectingTrait<T> addStaged(final TValue staged);

    default ProjectionselectingTrait<T> asProjectionselectingTrait() {
        return this;
    }

    @SuppressWarnings("unchecked")
    default T asProjectionselectingTraitToBaseType() {
        return (T) this;
    }
}
