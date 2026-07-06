
package com.commercetools.api.client;

import java.util.List;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProjectionselectingvariantTrait
 * @param <T> type of extending interface
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public interface ProjectionselectingvariantTrait<T extends ProjectionselectingvariantTrait<T>> {
    List<String> getStaged();

    /**
     * set staged with the specificied value
     * @param staged value to be set
     * @param <TValue> value type
     * @return ProjectionselectingvariantTrait
     */
    <TValue> ProjectionselectingvariantTrait<T> withStaged(final TValue staged);

    /**
     * add additional staged query parameter
     * @param staged value to be added
     * @param <TValue> value type
     * @return ProjectionselectingvariantTrait
     */
    <TValue> ProjectionselectingvariantTrait<T> addStaged(final TValue staged);

    default ProjectionselectingvariantTrait<T> asProjectionselectingvariantTrait() {
        return this;
    }

    @SuppressWarnings("unchecked")
    default T asProjectionselectingvariantTraitToBaseType() {
        return (T) this;
    }

}
