package com.wms.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author FreeMarker template error (DEBUG mode; use RETHROW in production!):
The following has evaluated to null or missing:
==> author  [in template "templates/serviceImpl.java.ftl" at line 14, column 14]

----
Tip: If the failing expression is known to legally refer to something that's sometimes null or missing, either specify a default value like myOptionalVar!myDefault, or use <#if myOptionalVar??>when-present<#else>when-missing</#if>. (These only cover the last step of the expression; to cover the whole expression, use parenthesis: (myOptionalVar.foo)!myDefault, (myOptionalVar.foo)??
----

----
FTL stack trace ("~" means nesting-related):
	- Failed at: ${author}  [in template "templates/serviceImpl.java.ftl" at line 14, column 12]
----

Java stack trace (for programmers):
----
freemarker.core.InvalidReferenceException: [... Exception message was already printed; see it above ...]
	at freemarker.core.InvalidReferenceException.getInstance(InvalidReferenceException.java:134)
	at freemarker.core.EvalUtil.coerceModelToTextualCommon(EvalUtil.java:479)
	at freemarker.core.EvalUtil.coerceModelToStringOrMarkup(EvalUtil.java:401)
	at freemarker.core.EvalUtil.coerceModelToStringOrMarkup(EvalUtil.java:370)
	at freemarker.core.DollarVariable.calculateInterpolatedStringOrMarkup(DollarVariable.java:100)
	at freemarker.core.DollarVariable.accept(DollarVariable.java:63)
	at freemarker.core.Environment.visit(Environment.java:331)
	at freemarker.core.Environment.visit(Environment.java:337)
	at freemarker.core.Environment.process(Environment.java:310)
	at freemarker.template.Template.process(Template.java:383)
	at com.baomidou.mybatisplus.generator.engine.FreemarkerTemplateEngine.writer(FreemarkerTemplateEngine.java:52)
	at com.baomidou.mybatisplus.generator.engine.AbstractTemplateEngine.batchOutput(AbstractTemplateEngine.java:119)
	at com.baomidou.mybatisplus.generator.AutoGenerator.execute(AutoGenerator.java:102)
	at com.wms.common.CodeGenerator.main(CodeGenerator.java:143)
