
package com.commercetools.api.client;

import java.util.List;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public interface ExpandableTrait<T extends ExpandableTrait<T>> {
    List<String> getExpand();

    /**
     * set expand with the specificied value
     */
    ExpandableTrait<T> withExpand(final String expand);

    /**
     * add additional expand query parameter
     */
    ExpandableTrait<T> addExpand(final String expand);

    default ExpandableTrait<T> asExpandableTrait() {
        return this;
    }

    @SuppressWarnings("unchecked")
    default T asExpandableTraitToBaseType() {
        return (T) this;
    }
}
