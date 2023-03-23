
package com.commercetools.api.models.me;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.business_unit.BusinessUnitUpdateAction;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * MyBusinessUnitUpdate
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     MyBusinessUnitUpdate myBusinessUnitUpdate = MyBusinessUnitUpdate.builder()
 *             .version(0.3)
 *             .plusActions(actionsBuilder -> actionsBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = MyBusinessUnitUpdateImpl.class)
public interface MyBusinessUnitUpdate {

    /**
     *  <p>Expected version of the BusinessUnit on which the changes should be applied. If the expected version does not match the actual version, a 409 Conflict error will be returned.</p>
     * @return version
     */
    @NotNull
    @JsonProperty("version")
    public Long getVersion();

    /**
     *  <p>Update actions to be performed on the BusinessUnit.</p>
     * @return actions
     */
    @NotNull
    @Valid
    @JsonProperty("actions")
    public List<BusinessUnitUpdateAction> getActions();

    public void setVersion(final Long version);

    @JsonIgnore
    public void setActions(final BusinessUnitUpdateAction... actions);

    public void setActions(final List<BusinessUnitUpdateAction> actions);

    public static MyBusinessUnitUpdate of() {
        return new MyBusinessUnitUpdateImpl();
    }

    public static MyBusinessUnitUpdate of(final MyBusinessUnitUpdate template) {
        MyBusinessUnitUpdateImpl instance = new MyBusinessUnitUpdateImpl();
        instance.setVersion(template.getVersion());
        instance.setActions(template.getActions());
        return instance;
    }

    public static MyBusinessUnitUpdateBuilder builder() {
        return MyBusinessUnitUpdateBuilder.of();
    }

    public static MyBusinessUnitUpdateBuilder builder(final MyBusinessUnitUpdate template) {
        return MyBusinessUnitUpdateBuilder.of(template);
    }

    default <T> T withMyBusinessUnitUpdate(Function<MyBusinessUnitUpdate, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<MyBusinessUnitUpdate> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<MyBusinessUnitUpdate>() {
            @Override
            public String toString() {
                return "TypeReference<MyBusinessUnitUpdate>";
            }
        };
    }
}
