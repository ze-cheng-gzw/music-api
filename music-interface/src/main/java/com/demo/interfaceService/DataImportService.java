package com.demo.interfaceService;

import com.demo.vo.ReadExcelVO;

public interface DataImportService {

    /**
     * 导入歌曲+歌手+专辑
     * @param readExcelVO
     * @return
     */
    boolean handleFileUpload(ReadExcelVO readExcelVO);

    /**
     * 导入歌曲+歌单
     * @param readExcelVO
     * @return
     */
    boolean importPlaylist(ReadExcelVO readExcelVO);
}
