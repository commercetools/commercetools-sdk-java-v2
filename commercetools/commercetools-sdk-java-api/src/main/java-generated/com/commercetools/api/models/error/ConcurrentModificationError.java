
package com.commercetools.api.models.error;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 Example to create an instance using the builder pattern
 <div class=code-example>
 <pre><code class='java'>
   ConcurrentModificationError concurrentModificationError = ConcurrentModificationError.builder()
           .message("{message}")
           .build()
 </code></pre>
 </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ConcurrentModificationErrorImpl.class)
public interface ConcurrentModificationError extends ErrorObject {

    String CONCURRENT_MODIFICATION = "ConcurrentModification";

    @JsonProperty("currentVersion")
    public Long getCurrentVersion();

    public void setCurrentVersion(final Long currentVersion);

    public static ConcurrentModificationError of() {
        return new ConcurrentModificationErrorImpl();
    }

    public static ConcurrentModificationError of(final ConcurrentModificationError template) {
        ConcurrentModificationErrorImpl instance = new ConcurrentModificationErrorImpl();
        instance.setMessage(template.getMessage());

        instance.setCurrentVersion(template.getCurrentVersion());
        return instance;
    }

    public static ConcurrentModificationErrorBuilder builder() {
        return ConcurrentModificationErrorBuilder.of();
    }

    public static ConcurrentModificationErrorBuilder builder(final ConcurrentModificationError template) {
        return ConcurrentModificationErrorBuilder.of(template);
    }

    default <T> T withConcurrentModificationError(Function<ConcurrentModificationError, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<ConcurrentModificationError> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ConcurrentModificationError>() {
            @Override
            public String toString() {
                return "TypeReference<ConcurrentModificationError>";
            }
        };
    }
}
