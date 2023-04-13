package at.spengergasse.backend.models;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum ComparatorEnum {
    // < | <= | >= | > |

    LESS("<"), LESS_EQUAL("<="), GREATER_EQUAL(">="), GREATER(">");

    String stringValue;

}
