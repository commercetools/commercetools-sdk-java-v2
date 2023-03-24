
package com.commercetools.api.client;

import java.util.List;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * LocaleprojectingTrait
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public interface LocaleprojectingTrait<T extends LocaleprojectingTrait<T>> {
    List<String> getLocaleProjection();

    /**
     * set localeProjection with the specificied value
     * @param localeProjection value to be set
     * @param <TValue> value type
     * @return LocaleprojectingTrait
     */
    <TValue> LocaleprojectingTrait<T> withLocaleProjection(final TValue localeProjection);

    /**
     * add additional localeProjection query parameter
     * @param localeProjection value to be added
     * @param <TValue> value type
     * @return LocaleprojectingTrait
     */
    <TValue> LocaleprojectingTrait<T> addLocaleProjection(final TValue localeProjection);

    default LocaleprojectingTrait<T> asLocaleprojectingTrait() {
        return this;
    }

    @SuppressWarnings("unchecked")
    default T asLocaleprojectingTraitToBaseType() {
        return (T) this;
    }

}
