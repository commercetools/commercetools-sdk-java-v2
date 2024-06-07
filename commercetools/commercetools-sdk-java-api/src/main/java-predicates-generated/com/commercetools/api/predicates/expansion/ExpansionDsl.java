
package com.commercetools.api.predicates.expansion;

import java.util.List;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public interface ExpansionDsl extends Builder<String> {
    public List<String> getPath();

    @Override
    public default String build() {
        return String.join(".", getPath());
    }
}
