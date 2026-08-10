
package com.commercetools.api.models.mcp_server;

import java.util.Arrays;
import java.util.Optional;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import io.vrap.rmf.base.client.JsonEnum;
import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Output formatting applied to every <code>tools/call</code> response on the MCP Server. The value names the conversion performed; when the field is absent, the response content shape is left untouched.</p>
 *  <ul>
 *   <li><code>JsonToTabular</code>: converts JSON tool output into a tabular representation.</li>
 *  </ul>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public interface McpServerToolOutputFormatting extends JsonEnum {

    /**
    <p>Converts JSON tool output into a tabular representation to reduce token count.</p> */
    McpServerToolOutputFormatting JSON_TO_TABULAR = McpServerToolOutputFormattingEnum.JSON_TO_TABULAR;

    /**
     * possible values of McpServerToolOutputFormatting
     */
    enum McpServerToolOutputFormattingEnum implements McpServerToolOutputFormatting {
        /**
         * JsonToTabular
         */
        JSON_TO_TABULAR("JsonToTabular");
        private final String jsonName;

        private McpServerToolOutputFormattingEnum(final String jsonName) {
            this.jsonName = jsonName;
        }

        public String getJsonName() {
            return jsonName;
        }

        public String toString() {
            return jsonName;
        }
    }

    /**
     * the JSON value
     * @return json value
     */
    @JsonValue
    String getJsonName();

    /**
     * the enum value
     * @return name
     */
    String name();

    /**
     * convert value to string
     * @return string representation
     */
    String toString();

    /**
     * factory method for a enum value of McpServerToolOutputFormatting
     * if no enum has been found an anonymous instance will be created
     * @param value the enum value to be wrapped
     * @return enum instance
     */
    @JsonCreator
    public static McpServerToolOutputFormatting findEnum(String value) {
        return findEnumViaJsonName(value).orElse(new McpServerToolOutputFormatting() {
            @Override
            public String getJsonName() {
                return value;
            }

            @Override
            public String name() {
                return value.toUpperCase();
            }

            public String toString() {
                return value;
            }
        });
    }

    /**
     * method to find enum using the JSON value
     * @param jsonName the json value to be wrapped
     * @return optional of enum instance
     */
    public static Optional<McpServerToolOutputFormatting> findEnumViaJsonName(String jsonName) {
        return Arrays.stream(values()).filter(t -> t.getJsonName().equals(jsonName)).findFirst();
    }

    /**
     * possible enum values
     * @return array of possible enum values
     */
    public static McpServerToolOutputFormatting[] values() {
        return McpServerToolOutputFormattingEnum.values();
    }

}
