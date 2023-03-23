
package com.commercetools.api.models.me;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.business_unit.AssociateDraft;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Updating the Associate on a Business Unit generates the BusinessUnitAssociateChanged Message.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     MyBusinessUnitChangeAssociateAction myBusinessUnitChangeAssociateAction = MyBusinessUnitChangeAssociateAction.builder()
 *             .associate(associateBuilder -> associateBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = MyBusinessUnitChangeAssociateActionImpl.class)
public interface MyBusinessUnitChangeAssociateAction extends MyBusinessUnitUpdateAction {

    String CHANGE_ASSOCIATE = "changeAssociate";

    /**
     *  <p>The Associate to add.</p>
     * @return associate
     */
    @NotNull
    @Valid
    @JsonProperty("associate")
    public AssociateDraft getAssociate();

    public void setAssociate(final AssociateDraft associate);

    public static MyBusinessUnitChangeAssociateAction of() {
        return new MyBusinessUnitChangeAssociateActionImpl();
    }

    public static MyBusinessUnitChangeAssociateAction of(final MyBusinessUnitChangeAssociateAction template) {
        MyBusinessUnitChangeAssociateActionImpl instance = new MyBusinessUnitChangeAssociateActionImpl();
        instance.setAssociate(template.getAssociate());
        return instance;
    }

    public static MyBusinessUnitChangeAssociateActionBuilder builder() {
        return MyBusinessUnitChangeAssociateActionBuilder.of();
    }

    public static MyBusinessUnitChangeAssociateActionBuilder builder(
            final MyBusinessUnitChangeAssociateAction template) {
        return MyBusinessUnitChangeAssociateActionBuilder.of(template);
    }

    default <T> T withMyBusinessUnitChangeAssociateAction(Function<MyBusinessUnitChangeAssociateAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<MyBusinessUnitChangeAssociateAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<MyBusinessUnitChangeAssociateAction>() {
            @Override
            public String toString() {
                return "TypeReference<MyBusinessUnitChangeAssociateAction>";
            }
        };
    }
}
