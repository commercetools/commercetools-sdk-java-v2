
package com.commercetools.api.client;

import java.util.List;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProjectionselectingtailoringTrait
 * @param <T> type of extending interface
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public interface ProjectionselectingtailoringTrait<T extends ProjectionselectingtailoringTrait<T>> {
    List<String> getStaged();

    /**
     * set staged with the specificied value
     * @param staged value to be set
     * @param <TValue> value type
     * @return ProjectionselectingtailoringTrait
     */
    <TValue> ProjectionselectingtailoringTrait<T> withStaged(final TValue staged);

    /**
     * add additional staged query parameter
     * @param staged value to be added
     * @param <TValue> value type
     * @return ProjectionselectingtailoringTrait
     */
    <TValue> ProjectionselectingtailoringTrait<T> addStaged(final TValue staged);

    default ProjectionselectingtailoringTrait<T> asProjectionselectingtailoringTrait() {
        return this;
    }

    @SuppressWarnings("unchecked")
    default T asProjectionselectingtailoringTraitToBaseType() {
        return (T) this;
    }

}
