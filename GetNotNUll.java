package com.eternel.aspect.androidcustomview.activity;
代码位置见图片
public class GetNotNUll {
    #if($field.modifierStatic)
    static ##
            #end
    $field.type ##
            #set($name = $StringUtil.capitalizeWithJavaBeanConvention($StringUtil.sanitizeJavaIdentifier($helper.getPropertyName($field, $project))))
            #if ($field.boolean && $field.primitive)
    is##
            #else
    get##
            #end
    ${name}() {
    #if($field.string)
            return $field.name==null?"" : $field.name;
    #else
        return $field.name;
     #end
    }
}
