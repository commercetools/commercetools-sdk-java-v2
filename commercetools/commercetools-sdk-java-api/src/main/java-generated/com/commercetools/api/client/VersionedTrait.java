
package com.commercetools.api.client;

import java.util.List;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public interface VersionedTrait<T> {
    List<String> getVersion();

    T withVersion(final long version);

    T addVersion(final long version);

}
