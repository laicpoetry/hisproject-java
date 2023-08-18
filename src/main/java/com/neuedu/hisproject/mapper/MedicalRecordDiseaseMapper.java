package com.neuedu.hisproject.mapper;

import com.neuedu.hisproject.domin.Disease;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;
public interface MedicalRecordDiseaseMapper {
@Insert("insert into medical_record_disease values(#{medicalRecordId},#{i})")
   int add(@Param("i")int i,@Param("medicalRecordId")Integer medicalRecordId);

@Select("select id,disease_code as diseaseCode,disease_name as diseaseName,diseaseICD,disease_category as diseaseCategory from disease where id in(select disease_id from medical_record_disease where medical_record_id = #{medicalRecordId})   ")
    List<Disease> get(int medicalRecordId);
}
