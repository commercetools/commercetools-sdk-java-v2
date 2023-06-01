package com.commercetools.api.models.error;

import com.commercetools.api.models.error.AnonymousIdAlreadyInUseError;
import com.commercetools.api.models.error.AssociateMissingPermissionError;
import com.commercetools.api.models.error.AttributeDefinitionAlreadyExistsError;
import com.commercetools.api.models.error.AttributeDefinitionTypeConflictError;
import com.commercetools.api.models.error.AttributeNameDoesNotExistError;
import com.commercetools.api.models.error.BadGatewayError;
import com.commercetools.api.models.error.ConcurrentModificationError;
import com.commercetools.api.models.error.CountryNotConfiguredInStoreError;
import com.commercetools.api.models.error.DiscountCodeNonApplicableError;
import com.commercetools.api.models.error.DuplicateAttributeValueError;
import com.commercetools.api.models.error.DuplicateAttributeValuesError;
import com.commercetools.api.models.error.DuplicateEnumValuesError;
import com.commercetools.api.models.error.DuplicateFieldError;
import com.commercetools.api.models.error.DuplicateFieldWithConflictingResourceError;
import com.commercetools.api.models.error.DuplicatePriceKeyError;
import com.commercetools.api.models.error.DuplicatePriceScopeError;
import com.commercetools.api.models.error.DuplicateStandalonePriceScopeError;
import com.commercetools.api.models.error.DuplicateVariantValuesError;
import com.commercetools.api.models.error.EditPreviewFailedError;
import com.commercetools.api.models.error.EnumKeyAlreadyExistsError;
import com.commercetools.api.models.error.EnumKeyDoesNotExistError;
import com.commercetools.api.models.error.EnumValueIsUsedError;
import com.commercetools.api.models.error.EnumValuesMustMatchError;
import com.commercetools.api.models.error.ExtensionBadResponseError;
import com.commercetools.api.models.error.ExtensionNoResponseError;
import com.commercetools.api.models.error.ExtensionPredicateEvaluationFailedError;
import com.commercetools.api.models.error.ExtensionUpdateActionsFailedError;
import com.commercetools.api.models.error.ExternalOAuthFailedError;
import com.commercetools.api.models.error.FeatureRemovedError;
import com.commercetools.api.models.error.GeneralError;
import com.commercetools.api.models.error.InsufficientScopeError;
import com.commercetools.api.models.error.InternalConstraintViolatedError;
import com.commercetools.api.models.error.InvalidCredentialsError;
import com.commercetools.api.models.error.InvalidCurrentPasswordError;
import com.commercetools.api.models.error.InvalidFieldError;
import com.commercetools.api.models.error.InvalidInputError;
import com.commercetools.api.models.error.InvalidItemShippingDetailsError;
import com.commercetools.api.models.error.InvalidJsonInputError;
import com.commercetools.api.models.error.InvalidOperationError;
import com.commercetools.api.models.error.InvalidSubjectError;
import com.commercetools.api.models.error.InvalidTokenError;
import com.commercetools.api.models.error.LanguageUsedInStoresError;
import com.commercetools.api.models.error.MatchingPriceNotFoundError;
import com.commercetools.api.models.error.MaxResourceLimitExceededError;
import com.commercetools.api.models.error.MissingRoleOnChannelError;
import com.commercetools.api.models.error.MissingTaxRateForCountryError;
import com.commercetools.api.models.error.MoneyOverflowError;
import com.commercetools.api.models.error.NoMatchingProductDiscountFoundError;
import com.commercetools.api.models.error.NotEnabledError;
import com.commercetools.api.models.error.ObjectNotFoundError;
import com.commercetools.api.models.error.OutOfStockError;
import com.commercetools.api.models.error.OverCapacityError;
import com.commercetools.api.models.error.OverlappingStandalonePriceValidityError;
import com.commercetools.api.models.error.PendingOperationError;
import com.commercetools.api.models.error.PriceChangedError;
import com.commercetools.api.models.error.ProductAssignmentMissingError;
import com.commercetools.api.models.error.ProductPresentWithDifferentVariantSelectionError;
import com.commercetools.api.models.error.ProjectNotConfiguredForLanguagesError;
import com.commercetools.api.models.error.QueryComplexityLimitExceededError;
import com.commercetools.api.models.error.QueryTimedOutError;
import com.commercetools.api.models.error.ReferenceExistsError;
import com.commercetools.api.models.error.ReferencedResourceNotFoundError;
import com.commercetools.api.models.error.RequiredFieldError;
import com.commercetools.api.models.error.ResourceNotFoundError;
import com.commercetools.api.models.error.ResourceSizeLimitExceededError;
import com.commercetools.api.models.error.SearchDeactivatedError;
import com.commercetools.api.models.error.SearchExecutionFailureError;
import com.commercetools.api.models.error.SearchFacetPathNotFoundError;
import com.commercetools.api.models.error.SearchIndexingInProgressError;
import com.commercetools.api.models.error.SemanticErrorError;
import com.commercetools.api.models.error.ShippingMethodDoesNotMatchCartError;
import com.commercetools.api.models.error.SyntaxErrorError;
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
 *  <p>Represents a single error. Multiple errors may be included in an ErrorResponse.</p>
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class ErrorObjectImpl implements ErrorObject, ModelBase {

    
    private String code;
    
    
    private String message;
    
    
    private Map<String, java.lang.Object> values;

    /**
     * create instance with all properties
     */
    @JsonCreator
    ErrorObjectImpl(@JsonProperty("code") final String code, @JsonProperty("message") final String message, @JsonProperty("values") final Map<String, java.lang.Object> values) {
        this.code = code;
        this.message = message;
        this.values = values;
    }
    /**
     * create empty instance
     */
    public ErrorObjectImpl() {
    }

    /**
     *  <p>Error identifier.</p>
     */
    
    public String getCode(){
        return this.code;
    }
    
    /**
     *  <p>Plain text description of the cause of the error.</p>
     */
    
    public String getMessage(){
        return this.message;
    }
    
    /**
     *  <p>Error-specific additional fields.</p>
     */
    
    public Map<String,java.lang.Object> values() {
        return values;
    }

    
    public void setMessage(final String message){
        this.message = message;
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
    
        ErrorObjectImpl that = (ErrorObjectImpl) o;
    
        return new EqualsBuilder()
                .append(code, that.code)
                .append(message, that.message)
                .append(values, that.values)
                .isEquals();
    }
    
    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
            .append(code)
            .append(message)
            .append(values)
            .toHashCode();
    }

}
