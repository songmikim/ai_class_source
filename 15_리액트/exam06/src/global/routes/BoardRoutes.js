import React from 'react';
import { Routes, Route } from 'react-router-dom';
import WritePage from '../../board/pages/WritePage';
import ViewPage from '../../board/pages/ViewPage';
import ListPage from '../../board/pages/ListPage';

const BoardRoutes = () => {
  return (
    <Routes>
      <Route path="/board/">
        <Route index element={<ListPage />} />
        <Route path="write/:bid" element={<WritePage />} />
        <Route path="view/:seq" element={<ViewPage />} />
        {/* 필요하다면 아래 경로를 유지 */}
        <Route path="list/:bid" element={<ListPage />} />
      </Route>
    </Routes>
  );
};

export default React.memo(BoardRoutes);
