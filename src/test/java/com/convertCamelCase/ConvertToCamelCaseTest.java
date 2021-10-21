package com.convertCamelCase;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConvertToCamelCaseTest {
    @Test
    public void ConvertToCamelCaseEasy(){
        String origStr = "my_variable_name";
        ConvertToCamelCase cCaseObj = new ConvertToCamelCase();
        assertEquals("myVariableName", cCaseObj.convertToCamelCase(origStr));
    }

    @Test
    public void ConvertToCamelCaseMoreDifficult(){
        String origStr = "my_variable____with_many_underscores";
        ConvertToCamelCase cCaseObj = new ConvertToCamelCase();
        assertEquals("myVariableWithManyUnderscores", cCaseObj.convertToCamelCase(origStr));
    }

    @Test
    public void ConvertToCamelCaseNumLetterMix(){
        String origStr = "var_123_var";
        ConvertToCamelCase cCaseObj = new ConvertToCamelCase();
        assertEquals("var123Var", cCaseObj.convertToCamelCase(origStr));
    }

    @Test
    public void ConvertToCamelCaseStartWithNum(){
        String origStr = "123_var";
        ConvertToCamelCase cCaseObj = new ConvertToCamelCase();
        assertEquals("123Var", cCaseObj.convertToCamelCase(origStr));
    }

    @Test
    public void ConvertToCamelCaseNumLetterMixTricky(){
        String origStr = "var___123__var";
        ConvertToCamelCase cCaseObj = new ConvertToCamelCase();
        assertEquals("var123Var", cCaseObj.convertToCamelCase(origStr));
    }

    // negative case
    @Test
    public void ConvertToCamelCaseStartInvalidInput(){
        String origStr = "123:var";
        ConvertToCamelCase cCaseObj = new ConvertToCamelCase();
        assertEquals("123:var", cCaseObj.convertToCamelCase(origStr));
    }
}