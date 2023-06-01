package com.commercetools.api.models.error;

import com.commercetools.api.models.error.GraphQLAnonymousIdAlreadyInUseError;
import com.commercetools.api.models.error.GraphQLAssociateMissingPermissionError;
import com.commercetools.api.models.error.GraphQLAttributeDefinitionAlreadyExistsError;
import com.commercetools.api.models.error.GraphQLAttributeDefinitionTypeConflictError;
import com.commercetools.api.models.error.GraphQLAttributeNameDoesNotExistError;
import com.commercetools.api.models.error.GraphQLBadGatewayError;
import com.commercetools.api.models.error.GraphQLConcurrentModificationError;
import com.commercetools.api.models.error.GraphQLCountryNotConfiguredInStoreError;
import com.commercetools.api.models.error.GraphQLDiscountCodeNonApplicableError;
import com.commercetools.api.models.error.GraphQLDuplicateAttributeValueError;
import com.commercetools.api.models.error.GraphQLDuplicateAttributeValuesError;
import com.commercetools.api.models.error.GraphQLDuplicateEnumValuesError;
import com.commercetools.api.models.error.GraphQLDuplicateFieldError;
import com.commercetools.api.models.error.GraphQLDuplicateFieldWithConflictingResourceError;
import com.commercetools.api.models.error.GraphQLDuplicatePriceKeyError;
import com.commercetools.api.models.error.GraphQLDuplicatePriceScopeError;
import com.commercetools.api.models.error.GraphQLDuplicateStandalonePriceScopeError;
import com.commercetools.api.models.error.GraphQLDuplicateVariantValuesError;
import com.commercetools.api.models.error.GraphQLEditPreviewFailedError;
import com.commercetools.api.models.error.GraphQLEnumKeyAlreadyExistsError;
import com.commercetools.api.models.error.GraphQLEnumKeyDoesNotExistError;
import com.commercetools.api.models.error.GraphQLEnumValueIsUsedError;
import com.commercetools.api.models.error.GraphQLEnumValuesMustMatchError;
import com.commercetools.api.models.error.GraphQLExtensionBadResponseError;
import com.commercetools.api.models.error.GraphQLExtensionNoResponseError;
import com.commercetools.api.models.error.GraphQLExtensionPredicateEvaluationFailedError;
import com.commercetools.api.models.error.GraphQLExtensionUpdateActionsFailedError;
import com.commercetools.api.models.error.GraphQLExternalOAuthFailedError;
import com.commercetools.api.models.error.GraphQLFeatureRemovedError;
import com.commercetools.api.models.error.GraphQLGeneralError;
import com.commercetools.api.models.error.GraphQLInsufficientScopeError;
import com.commercetools.api.models.error.GraphQLInternalConstraintViolatedError;
import com.commercetools.api.models.error.GraphQLInvalidCredentialsError;
import com.commercetools.api.models.error.GraphQLInvalidCurrentPasswordError;
import com.commercetools.api.models.error.GraphQLInvalidFieldError;
import com.commercetools.api.models.error.GraphQLInvalidInputError;
import com.commercetools.api.models.error.GraphQLInvalidItemShippingDetailsError;
import com.commercetools.api.models.error.GraphQLInvalidJsonInputError;
import com.commercetools.api.models.error.GraphQLInvalidOperationError;
import com.commercetools.api.models.error.GraphQLInvalidSubjectError;
import com.commercetools.api.models.error.GraphQLInvalidTokenError;
import com.commercetools.api.models.error.GraphQLLanguageUsedInStoresError;
import com.commercetools.api.models.error.GraphQLMatchingPriceNotFoundError;
import com.commercetools.api.models.error.GraphQLMaxResourceLimitExceededError;
import com.commercetools.api.models.error.GraphQLMissingRoleOnChannelError;
import com.commercetools.api.models.error.GraphQLMissingTaxRateForCountryError;
import com.commercetools.api.models.error.GraphQLMoneyOverflowError;
import com.commercetools.api.models.error.GraphQLNoMatchingProductDiscountFoundError;
import com.commercetools.api.models.error.GraphQLNotEnabledError;
import com.commercetools.api.models.error.GraphQLObjectNotFoundError;
import com.commercetools.api.models.error.GraphQLOutOfStockError;
import com.commercetools.api.models.error.GraphQLOverCapacityError;
import com.commercetools.api.models.error.GraphQLOverlappingStandalonePriceValidityError;
import com.commercetools.api.models.error.GraphQLPendingOperationError;
import com.commercetools.api.models.error.GraphQLPriceChangedError;
import com.commercetools.api.models.error.GraphQLProductAssignmentMissingError;
import com.commercetools.api.models.error.GraphQLProductPresentWithDifferentVariantSelectionError;
import com.commercetools.api.models.error.GraphQLProjectNotConfiguredForLanguagesError;
import com.commercetools.api.models.error.GraphQLQueryComplexityLimitExceededError;
import com.commercetools.api.models.error.GraphQLQueryTimedOutError;
import com.commercetools.api.models.error.GraphQLReferenceExistsError;
import com.commercetools.api.models.error.GraphQLReferencedResourceNotFoundError;
import com.commercetools.api.models.error.GraphQLRequiredFieldError;
import com.commercetools.api.models.error.GraphQLResourceNotFoundError;
import com.commercetools.api.models.error.GraphQLResourceSizeLimitExceededError;
import com.commercetools.api.models.error.GraphQLSearchDeactivatedError;
import com.commercetools.api.models.error.GraphQLSearchExecutionFailureError;
import com.commercetools.api.models.error.GraphQLSearchFacetPathNotFoundError;
import com.commercetools.api.models.error.GraphQLSearchIndexingInProgressError;
import com.commercetools.api.models.error.GraphQLSemanticErrorError;
import com.commercetools.api.models.error.GraphQLShippingMethodDoesNotMatchCartError;
import com.commercetools.api.models.error.GraphQLSyntaxErrorError;
import java.lang.Object;
import io.vrap.rmf.base.client.utils.Generated;
import io.vrap.rmf.base.client.ModelBase;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.annotation.*;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

/**
 *  <p>Represents a single error.</p>
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class GraphQLErrorObjectImpl implements GraphQLErrorObject, ModelBase {

    
    private String code;
    
    
    private Map<String, java.lang.Object> values;

    /**
     * create instance with all properties
     */
    @JsonCreator
    GraphQLErrorObjectImpl(@JsonProperty("code") final String code, @JsonProperty("values") final Map<String, java.lang.Object> values) {
        this.code = code;
        this.values = values;
    }
    /**
     * create empty instance
     */
    public GraphQLErrorObjectImpl() {
    }

    /**
     *  <p>Error identifier.</p>
     */
    
    public String getCode(){
        return this.code;
    }
    
    /**
     *  <p>Error-specific additional fields.</p>
     */
    
    public Map<String,java.lang.Object> values() {
        return values;
    }

    
    public void setValue(String key, java.lang.Object value) {
        if (values == null) {
            values = new HashMap<>();
        }
        values.put(key, value);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
    
        if (o == null || getClass() != o.getClass()) return false;
    
        GraphQLErrorObjectImpl that = (GraphQLErrorObjectImpl) o;
    
        return new EqualsBuilder()
                .append(code, that.code)
                .append(values, that.values)
                .isEquals();
    }
    
    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
            .append(code)
            .append(values)
            .toHashCode();
    }

}
