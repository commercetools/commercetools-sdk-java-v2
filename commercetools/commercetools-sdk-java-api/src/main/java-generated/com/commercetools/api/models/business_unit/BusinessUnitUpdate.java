
package com.commercetools.api.models.business_unit;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * BusinessUnitUpdate
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     BusinessUnitUpdate businessUnitUpdate = BusinessUnitUpdate.builder()
 *             .version(0.3)
 *             .plusActions(actionsBuilder -> actionsBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = BusinessUnitUpdateImpl.class)
public interface BusinessUnitUpdate {

    /**
     *  <p>Expected version of the BusinessUnit on which the changes should be applied. If the expected version does not match the actual version, a 409 Conflict error will be returned.</p>
     */
    @NotNull
    @JsonProperty("version")
    public Long getVersion();

    /**
     *  <p>Update actions to be performed on the BusinessUnit.</p>
     */
    @NotNull
    @Valid
    @JsonProperty("actions")
    public List<BusinessUnitUpdateAction> getActions();

    public void setVersion(final Long version);

    @JsonIgnore
    public void setActions(final BusinessUnitUpdateAction... actions);

    public void setActions(final List<BusinessUnitUpdateAction> actions);

    public static BusinessUnitUpdate of() {
        return new BusinessUnitUpdateImpl();
    }

    public static BusinessUnitUpdate of(final BusinessUnitUpdate template) {
        BusinessUnitUpdateImpl instance = new BusinessUnitUpdateImpl();
        instance.setVersion(template.getVersion());
        instance.setActions(template.getActions());
        return instance;
    }

    public static BusinessUnitUpdateBuilder builder() {
        return BusinessUnitUpdateBuilder.of();
    }

    public static BusinessUnitUpdateBuilder builder(final BusinessUnitUpdate template) {
        return BusinessUnitUpdateBuilder.of(template);
    }

    default <T> T withBusinessUnitUpdate(Function<BusinessUnitUpdate, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<BusinessUnitUpdate> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<BusinessUnitUpdate>() {
            @Override
            public String toString() {
                return "TypeReference<BusinessUnitUpdate>";
            }
        };
    }
}
